package guru.springframework.springaiintro.model;

import com.fasterxml.jackson.annotation.JsonPropertyDescription;

public record CapitalResponseComplete(@JsonPropertyDescription("This is the city name") String city,
                                      @JsonPropertyDescription("This is the city name") String population,
                                      @JsonPropertyDescription("This is the city name") String region,
                                      @JsonPropertyDescription("This is the city name") String language,
                                      @JsonPropertyDescription("This is the city name") String currency) {
}
