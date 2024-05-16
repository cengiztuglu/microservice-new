package com.SpringExample.inventoryservice.controller;

import com.SpringExample.inventoryservice.dto.InventoryResponse;
import com.SpringExample.inventoryservice.model.Inventory;
import com.SpringExample.inventoryservice.repository.InventoryRepository;
import com.SpringExample.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<InventoryResponse> isInStock(@RequestParam List<String> skuCode) {
        return inventoryService.isInStock(skuCode);
    }

}
