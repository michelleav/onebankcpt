package nl.onebank.onebankcpt.controller

import nl.onebank.onebankcpt.producers.TransferProducer
import nl.onebank.dto.TransferDto
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class TransferController(
    private val exampleJsonProducer: TransferProducer
) {
    @PostMapping("/obcpt/transfer")
    fun createTransfer(@RequestBody request: TransferDto) {
        exampleJsonProducer.sendTransferDtoMessage(request)
    }
}