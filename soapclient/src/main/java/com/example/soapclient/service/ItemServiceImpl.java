package com.example.soapclient.service;

import com.example.soapclient.dto.ItemRequest;
import com.example.soapclient.dto.ItemResponse;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {

    @Override
    public ItemResponse getItem(final ItemRequest itemRequest){
        final ItemResponse itemResponse = new ItemResponse();
        itemResponse.setId(itemRequest.getId());
        itemResponse.setCategory("Sample Category_"+itemRequest.getId());
        itemResponse.setName("Sample ItemName_"+itemRequest.getId());
        return itemResponse;
    }
}