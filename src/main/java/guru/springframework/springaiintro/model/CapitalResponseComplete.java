package guru.springframework.springaiintro.model;

import com.fasterxml.jackson.annotation.JsonPropertyDescription;

public record CapitalResponseComplete(@JsonPropertyDescription("This is the city name") String city,
                                      @JsonPropertyDescription("This is the city population") String population,
                                      @JsonPropertyDescription("This is the city region") String region,
                                      @JsonPropertyDescription("This is the city language") String language,
                                      @JsonPropertyDescription("This is the city currency") String currency) {
}
