package nl.onebank.onebankcpt.transfermanagement.repository

import nl.onebank.onebankcpt.accountmanagement.entity.TransferHistory
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TransferHistoryRepository : JpaRepository<TransferHistory, Long> {
}