package com.stocks.api_rest.resources;

import com.stocks.api_rest.models.Stocks;
import com.stocks.api_rest.repository.StocksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class StocksResources {
    @Autowired
    StocksRepository stocksRepository;

    //===================== READ ALL STOCKS ==============================//
    @GetMapping("/stock")
    public List<Stocks> ListaStocks() {
        return stocksRepository.findAll();
    }

    //===================== READ THE STOCK ===============================//
    @GetMapping("/{name}")
    public Stocks ListaStockUnico(@PathVariable(value="name") String name) {
        return stocksRepository.findByName(name);
    }

    //===================== CREATE STOCK ===============================//
    @PostMapping("/stock")
    public Stocks createStocks(@RequestBody Stocks stocks){
        return stocksRepository.save(stocks);
    }

    //===================== DELETE STOCK ===============================//
    @DeleteMapping("/stock/{name}")
    public void deleteStock(@PathVariable(value="name") String name){
        System.out.print("==> " + name.toString());
        //stocksRepository.delete;

    }


}
//====================================================================//

