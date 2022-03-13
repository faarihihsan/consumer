package com.consumer.rencanastudi.repository;

import com.consumer.rencanastudi.model.RencanaStudiModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RencanaStudiDb extends JpaRepository<RencanaStudiModel, Long> {
    RencanaStudiModel findById(Integer id);
}
