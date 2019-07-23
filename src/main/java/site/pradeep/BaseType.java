package site.pradeep;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

@JsonTypeInfo(use=Id.NAME, property = "type")
@JsonSubTypes({
    @Type(value=SubType1.class, name = "type1"),
    @Type(value=SubType2.class, name = "type2")
})
public class BaseType {
  
}
