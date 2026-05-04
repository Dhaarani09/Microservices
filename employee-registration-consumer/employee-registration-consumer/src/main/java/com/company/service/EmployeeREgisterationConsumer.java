package com.company.service;

import com.company.domain.Employee;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class EmployeeREgisterationConsumer {

    @RabbitListener(queues = "${rabbitmq.queue.name}")
    public void receive(Employee employee) {
        System.out.println("🔥 Received message: " + employee);
    }

}
