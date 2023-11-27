package flab.project.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ChatMessageRequestDto {
    private Long roomId;
    private String sender;
    private String message;
}
