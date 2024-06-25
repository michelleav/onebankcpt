package nl.onebank.onebankcpt.producers

import nl.onebank.onebankcpt.TRANSFER_TOPIC
import nl.onebank.dto.TransferDto
import org.slf4j.LoggerFactory
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Component

@Component
class TransferProducer(
    private val transferDtoKafkaTemplate: KafkaTemplate<String, TransferDto>
) {
    private val logger = LoggerFactory.getLogger(this.javaClass)

    fun sendTransferDtoMessage(dto: TransferDto) {
        transferDtoKafkaTemplate.send(TRANSFER_TOPIC, dto)
        logger.info("Message sent: [$dto]")
    }
}