package com.rafaelvnc.billingsoftware.service;

import com.rafaelvnc.billingsoftware.io.ItemRequest;
import com.rafaelvnc.billingsoftware.io.ItemResponse;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ItemService {

    ItemResponse add(ItemRequest request, MultipartFile file);

    List<ItemResponse> fetchItems();

    void deleteItem(String itemId);

}
