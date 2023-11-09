package com.betrybe.museumfinder.dto;

import com.betrybe.museumfinder.model.Coordinate;

/**
 * The type Museum creation dto.
 */
public record MuseumCreationDto(
    String name,
    String description,
    String address,
    String collectionType,
    String subject,
    String url,
    Coordinate coordinate
) {

  /**
   * Name string.
   *
   * @return the string
   */
  @Override
  public String name() {
    return name;
  }

  /**
   * Description string.
   *
   * @return the string
   */
  @Override
  public String description() {
    return description;
  }

  /**
   * Address string.
   *
   * @return the string
   */
  @Override
  public String address() {
    return address;
  }

  /**
   * Collection type string.
   *
   * @return the string
   */
  @Override
  public String collectionType() {
    return collectionType;
  }

  /**
   * Subject string.
   *
   * @return the string
   */
  @Override
  public String subject() {
    return subject;
  }

  /**
   * Url string.
   *
   * @return the string
   */
  @Override
  public String url() {
    return url;
  }

  /**
   * Coordinate coordinate.
   *
   * @return the coordinate
   */
  @Override
  public Coordinate coordinate() {
    return coordinate;
  }
}
