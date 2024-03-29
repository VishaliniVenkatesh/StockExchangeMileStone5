package com.demo.SpringMVCBoot.service;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.demo.SpringMVCBoot.dao.StockPriceDao;
import com.demo.SpringMVCBoot.model.StockPrice;

@Service
public class StockPriceServiceImpl implements StockPriceService{

	
	@Autowired
	private StockPriceDao stockPriceDao;
	
	@Override
	public List<StockPrice> getStockPriceList() {
		// TODO Auto-generated method stub
		return stockPriceDao.findAll();
	}

	@Override
	public StockPrice insertStock(StockPrice stockPrice) {
		return stockPriceDao.save(stockPrice);
		
	}

	@Override
	public List<StockPrice> findBycompanyCode(int stockPrice) {
		return stockPriceDao.findBycompanyCode(stockPrice);
	}

	
	public List<StockPrice> upload(MultipartFile file) throws Exception {
		System.out.println("success");
		Path tempDir = Files.createTempDirectory("");

		File tempFile = tempDir.resolve(file.getOriginalFilename()).toFile();

		file.transferTo(tempFile);

		Workbook workbook = WorkbookFactory.create(tempFile);

		Sheet sheet = workbook.getSheetAt(0);
		DataFormatter dataFormatter = new DataFormatter();
		List<StockPrice> list = new ArrayList<>();
		
		int flag = 0;
		for (Row row : sheet) {
			int i = 0;
			
			if (row.getRowNum() > 0) {
				StockPrice stockPrice = new StockPrice();
				for (Cell cell : row) {
					String cellValue = dataFormatter.formatCellValue(cell);
					if (cellValue.equals("")) {
						flag = 1;
						break;
					}
					i++;
					switch (i) {
					case 1:
						int companyCode = (int) Double.parseDouble(cellValue);
						stockPrice.setCompanyCode(companyCode);
						break;
					case 2:
						double price = Double.parseDouble(cellValue);
						stockPrice.setCurrentPrice(price);
						break;
					case 3:
						String stockEx = cellValue;
						stockPrice.setStockExchangeId(stockEx);
						break;
					case 4:
						Date date = cell.getDateCellValue();
						stockPrice.setDate(date);
						break;
					case 5:
						Date time=cell.getDateCellValue();
						stockPrice.setTime(time);
						break;
					}
				}
				if (flag == 1)
					break;
				stockPriceDao.save(stockPrice);
				list.add(stockPrice);
			}
		}
		return list;
	}


}
