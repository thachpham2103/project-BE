package com.example.projectbase.domain.dto.response.chat;

import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class MessageResponse {

    private Long messageId;
    private Long convoId;
    private Long senderId;
    private String body;
    private LocalDateTime sentAt;
    private boolean isRead;

}
