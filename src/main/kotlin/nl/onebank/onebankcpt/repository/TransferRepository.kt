package nl.onebank.onebankcpt.repository

import nl.onebank.onebankcpt.entity.Transfer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TransferRepository : JpaRepository<Transfer, Long> {
}