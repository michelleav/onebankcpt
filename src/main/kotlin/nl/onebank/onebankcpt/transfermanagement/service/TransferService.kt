package nl.onebank.onebankcpt.transfermanagement.service

import nl.onebank.dto.TransferDto
import nl.onebank.onebankcpt.accountmanagement.entity.Transfer
import nl.onebank.onebankcpt.transfermanagement.repository.TransferRepository
import org.springframework.stereotype.Service

@Service
class TransferService(val transferRepository: TransferRepository) {
    fun createTransfer(newTransfer: TransferDto) : Transfer {
        var transfer = newTransfer.toEntity()
        transferRepository.save(transfer)
        return transfer
    }
}