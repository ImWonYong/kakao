package flab.project.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
public class SmsVerification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    private String verificationCode;

    @Column(nullable = false)
    private LocalDateTime expirationTime;

    @Column(nullable = false)
    private boolean isVerified;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    public void successVerification() {
        this.isVerified = true;
    }
    @Builder
    public SmsVerification(String phoneNumber, String verificationCode, LocalDateTime expirationTime, boolean isVerified, LocalDateTime createdAt) {
        this.phoneNumber = phoneNumber;
        this.verificationCode = verificationCode;
        this.expirationTime = expirationTime;
        this.isVerified = isVerified;
        this.createdAt = createdAt;
    }
}