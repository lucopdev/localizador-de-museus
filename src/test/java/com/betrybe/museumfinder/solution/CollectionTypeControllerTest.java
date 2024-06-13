package com.betrybe.museumfinder.solution;

import static org.mockito.ArgumentMatchers.anyString;

import com.betrybe.museumfinder.dto.CollectionTypeCount;
import com.betrybe.museumfinder.service.CollectionTypeService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT)
@AutoConfigureMockMvc
public class CollectionTypeControllerTest {

  @Autowired
  private MockMvc mockMvc;
  @MockBean
  private CollectionTypeService collectionService;

  @Test
  @DisplayName("Testando a contagem")
  public void testCount() throws Exception {
    String[] collection = new String[]{"teste", "teste2"};
    CollectionTypeCount collectionTypeCount = new CollectionTypeCount(collection, 10);
    Mockito.when(collectionService.countByCollectionTypes(anyString()))
        .thenReturn(collectionTypeCount);
  }
}
