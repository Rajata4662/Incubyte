package com.example.demo.Client;

import com.example.demo.dto.FakeStoreProductRequestDTO;
import com.example.demo.dto.FakeStoreProductResponseDTO;
import com.example.demo.dto.ProdcutResponseDTO;
import com.example.demo.dto.ProductResponseDTOList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@Component
public class FakeStoreAPIClient {

@Autowired
private RestTemplateBuilder restTemplateBuilder;

    @Value("${fakestore.api.path.product}")
    private String fakeStoreAPIPathProduct;


    @Value("${fakestore.api.url}")
    private String fakeStoreAPIURL;







public FakeStoreProductResponseDTO createProduct(@RequestBody FakeStoreProductRequestDTO fakeStoreProductRequestDTO)
{


 String fakeStoreProductUrl = fakeStoreAPIPathProduct + fakeStoreAPIURL;


    String createProductUrl  = fakeStoreAPIURL + fakeStoreAPIPathProduct;
    RestTemplate restTemplate = restTemplateBuilder.build();
    ResponseEntity<FakeStoreProductResponseDTO> productResponse =
            restTemplate.postForEntity(createProductUrl, fakeStoreProductRequestDTO, FakeStoreProductResponseDTO.class);
    return productResponse.getBody();
}

    public List<FakeStoreProductResponseDTO>  getAllProducts()
    {


        String fakeStoreProductUrl = fakeStoreAPIPathProduct + fakeStoreAPIURL;


        String getProductUrl  = fakeStoreAPIURL + fakeStoreAPIPathProduct;
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<FakeStoreProductResponseDTO[]> productResponse =
                restTemplate.getForEntity(getProductUrl,FakeStoreProductResponseDTO[].class);
        return List.of(productResponse.getBody());
    }


}







