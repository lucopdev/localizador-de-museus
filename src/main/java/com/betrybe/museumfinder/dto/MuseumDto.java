package com.betrybe.museumfinder.dto;

import com.betrybe.museumfinder.model.Coordinate;

/**
 * The type Museum dto.
 */
public record MuseumDto(
    Long id,
    String name,
    String description,
    String address,
    String collectionType,
    String subject,
    String url,
    Coordinate coordinate
) {

  /**
   * Id long.
   *
   * @return the long
   */
  @Override
  public Long id() {
    return id;
  }

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
