package site.pradeep;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kjetland.jackson.jsonSchema.JsonSchemaGenerator;
import org.junit.Test;

public class SchemaGenerationTest {

  @Test
  public void test() throws Exception {
    ObjectMapper objectMapper = new ObjectMapper();
    JsonSchemaGenerator jsonSchemaGenerator = new JsonSchemaGenerator(objectMapper);
    JsonNode jsonSchema = jsonSchemaGenerator.generateJsonSchema(BaseType.class);
    System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonSchema));
  }

  @Test
  public void test2() throws Exception {
    ObjectMapper objectMapper = new ObjectMapper();
    JsonSchemaGenerator jsonSchemaGenerator = new JsonSchemaGenerator(objectMapper);
    JsonNode jsonSchema = jsonSchemaGenerator.generateJsonSchema(NonInheritingClass.class);
    System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonSchema));
  }
}
