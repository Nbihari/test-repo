package contracts.vendors

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method 'GET'
        url '/templates?name=Contact-default'

    }

    response {
        status 200
        body """[
                {
                "subject":"Test Subject",
                "messageContentType":"text",
                "name":"Contact",
                "templateType":"Mustache",
                "message":"Test message"
                }]
"""
        headers {
            contentType applicationJson()
        }
    }

}