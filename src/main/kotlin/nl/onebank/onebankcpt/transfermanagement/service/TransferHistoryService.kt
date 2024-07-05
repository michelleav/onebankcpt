package nl.onebank.onebankcpt.transfermanagement.service

import nl.onebank.onebankcpt.transfermanagement.repository.TransferHistoryRepository
import org.springframework.stereotype.Service

@Service
class TransferHistoryService(val transferHistoryRepository: TransferHistoryRepository) {
}