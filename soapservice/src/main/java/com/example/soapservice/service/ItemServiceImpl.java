package com.example.soapservice.service;

import com.example.soapservice.dto.ItemRequest;
import com.example.soapservice.dto.ItemResponse;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {

    @Override
    public ItemResponse getItem(final ItemRequest itemRequest){
        final ItemResponse itemResponse = new ItemResponse();
        itemResponse.setId(itemRequest.getId());
        itemResponse.setCategory("Sample Category "+itemRequest.getId());
        itemResponse.setName("Sample ItemName "+itemRequest.getId());
        return itemResponse;
    }
}