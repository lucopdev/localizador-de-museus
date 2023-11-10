package com.betrybe.museumfinder.controller;

import com.betrybe.museumfinder.dto.MuseumCreationDto;
import com.betrybe.museumfinder.model.Coordinate;
import com.betrybe.museumfinder.model.Museum;
import com.betrybe.museumfinder.service.MuseumServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type Museum controller.
 */
@RestController
@RequestMapping("/museums")
public class MuseumController {

  /**
   * The Museum service.
   */
  MuseumServiceInterface museumService;

  /**
   * Instantiates a new Museum controller.
   *
   * @param museumService the museum service
   */
  @Autowired
  public MuseumController(MuseumServiceInterface museumService) {
    this.museumService = museumService;
  }

  /**
   * Create museum response entity.
   *
   * @param newMuseum the new museum
   * @return the response entity
   */
  @PostMapping
  public ResponseEntity<Museum> createMuseum(@RequestBody MuseumCreationDto newMuseum) {
    Museum museum = new Museum();

    museum.setName(newMuseum.name());
    museum.setDescription(newMuseum.description());
    museum.setAddress(newMuseum.address());
    museum.setCollectionType(newMuseum.collectionType());
    museum.setSubject(newMuseum.subject());
    museum.setUrl(newMuseum.url());
    museum.setCoordinate(newMuseum.coordinate());

    Museum result = museumService.createMuseum(museum);

    return ResponseEntity.status(HttpStatus.CREATED).body(result);
  }

  /**
   * Closest museum response entity.
   *
   * @param lat       the lat
   * @param lng       the lng
   * @param maxDistKm the max dist km
   * @return the response entity
   */
  @GetMapping("/closest")
  public ResponseEntity<Museum> closestMuseum(
      @RequestParam Double lat,
      @RequestParam Double lng,
      @RequestParam(name = "max_dist_km") Double maxDistKm
  ) {
    Coordinate coordinate = new Coordinate(lat, lng);

    Museum result = museumService.getClosestMuseum(coordinate, maxDistKm);
    return ResponseEntity.ok(result);
  }
}
