package com.example.projectbase.service;

import com.example.projectbase.domain.dto.request.chat.CreateConversationRequest;

import java.util.List;

public interface ChatService {

    ConversationResponse createConversation(CreateConversationRequest req);
    MessageResponse sendMessage(Long sendId, SendMessageRequest req);
    List<MessageResponse> getMessage(Long convoId);
    List<ConversationResponse> getConversationForUser(Long userId);
}
