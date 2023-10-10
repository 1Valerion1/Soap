package com.example.soapclient.client;

import com.example.soapclient.dto.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

@Service
@RequiredArgsConstructor
public class SoapClientImpl {
  private final WebServiceTemplate template;


  public GetCountryResponse getCountry(String name) {
    final GetCountryRequest request = new GetCountryRequest();
    request.setName(name);
    return (GetCountryResponse) template.marshalSendAndReceive("http://localhost:8081/ws", request);
  }

  public GetMovieResponse getMovie(String genere) {
    final GetMovieRequest request = new GetMovieRequest();
    request.setGenre(genere);
    return (GetMovieResponse) template.marshalSendAndReceive("http://localhost:8081/ws", request);
  }

  public ItemResponse getItemInfo(int id) {
    final ItemRequest itemRequest = new ItemRequest();
    itemRequest.setId(id);
    return (ItemResponse) template.marshalSendAndReceive("http://localhost:8081/ws", itemRequest);
  }
}
