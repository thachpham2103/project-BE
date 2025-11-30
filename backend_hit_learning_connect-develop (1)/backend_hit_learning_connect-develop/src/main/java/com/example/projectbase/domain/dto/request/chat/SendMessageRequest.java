package com.example.projectbase.domain.dto.request.chat;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class SendMessageRequest {

    private Long convoId;
    private Long receiverId;
    private String body;

}
