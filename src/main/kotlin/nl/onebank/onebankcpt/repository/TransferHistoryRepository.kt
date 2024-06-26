package nl.onebank.onebankcpt.repository

import nl.onebank.onebankcpt.entity.TransferHistory
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TransferHistoryRepository : JpaRepository<TransferHistory, Long> {
}