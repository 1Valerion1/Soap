package com.example.soapservice.service;

import com.example.soapservice.dto.ItemRequest;
import com.example.soapservice.dto.ItemResponse;

public interface ItemService {
    ItemResponse getItem(final ItemRequest itemRequest);
}
