package nl.onebank.onebankcpt.accountmanagement.producer

import nl.onebank.dto.AccountDto
import nl.onebank.onebankcpt.shared.NEW_ACCOUNT_TOPIC
import org.slf4j.LoggerFactory
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Component

@Component
class AccountProducer(
    private val transferDtoKafkaTemplate: KafkaTemplate<String, AccountDto>
) {
    private val logger = LoggerFactory.getLogger(this.javaClass)

    fun sendNewAccountDtoMessage(dto: AccountDto) {
        transferDtoKafkaTemplate.send(NEW_ACCOUNT_TOPIC, dto)
        logger.info("Message sent to NEW_ACCOUNT_TOPIC : [$dto]")
    }
}