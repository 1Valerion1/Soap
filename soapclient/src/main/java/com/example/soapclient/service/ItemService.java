package com.example.soapclient.service;

import com.example.soapclient.dto.ItemRequest;
import com.example.soapclient.dto.ItemResponse;

public interface ItemService {
    ItemResponse getItem(final ItemRequest itemRequest);
}
