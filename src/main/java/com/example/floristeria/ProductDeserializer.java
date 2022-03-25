package com.example.floristeria;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.node.ObjectNode;

/*import java.io.IOException;

public class ProductDeserializer <T> extends StdDeserializer<Product<T>> {
    private static final long serialVersionUID = 1L;

    public ProductDeserializer(){
        this(null);
    }
    public  ProductDeserializer(Class<?>vc){
        super(vc);
    }

    private ObjectMapper objectMapper;

    @Override
    public Product<T> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException {
        String metricType = jsonParser.getCurrentName();
        objectMapper = (ObjectMapper) jsonParser.getCodec();
        ObjectNode objectNode = (ObjectNode) objectMapper.readTree(jsonParser);
        Iterator<Entry<String, JsonNode>> elementsIterator = objectNode.fields();
    }
}*/
