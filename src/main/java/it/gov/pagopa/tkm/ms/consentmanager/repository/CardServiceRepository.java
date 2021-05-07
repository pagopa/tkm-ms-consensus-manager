package it.gov.pagopa.tkm.ms.consentmanager.repository;

import it.gov.pagopa.tkm.ms.consentmanager.model.entity.*;
import org.springframework.data.jpa.repository.*;

import java.util.*;

public interface CardServiceRepository extends JpaRepository<TkmCardService, Long> {

    List<TkmCardService> findByServiceInAndCard(List<TkmService> services, TkmCard card);

}