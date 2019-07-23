package site.pradeep;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kjetland.jackson.jsonSchema.annotations.JsonSchemaTitle;

@JsonSchemaTitle("SeparateClass")
public class NonInheritingClass {

  @JsonProperty
  private String something;
}
