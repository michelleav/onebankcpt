package nl.onebank.onebankcpt.controller

import nl.onebank.onebankcpt.producers.TransferProducer
import nl.onebank.dto.TransferDto
import nl.onebank.onebankcpt.entity.Transfer
import nl.onebank.onebankcpt.service.TransferService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class TransferController(private val transferService: TransferService,
                         private val exampleJsonProducer: TransferProducer
) {
    @PostMapping("/obcpt/transfer")
    fun createTransfer(@RequestBody request: TransferDto) : Transfer {
        var transfer = transferService.createTransfer(request)
        exampleJsonProducer.sendTransferDtoMessage(request)
        return transfer
    }
}