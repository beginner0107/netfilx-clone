package com.cow.netflix.sample;

import lombok.Getter;

@Getter
public class SampleResponse {
  private final String name;

  public SampleResponse(String name) {
    this.name = name;
  }
}
