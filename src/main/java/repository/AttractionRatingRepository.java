package repository;

import model.jpa.AttractionRating;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttractionRatingRepository extends JpaRepository<AttractionRating, Long> {
}
