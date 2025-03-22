package com.diogodev.Event_Driven.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@Data
@Entity
@Table(name = "estoque")
public class Estoque {
    @Id
    private UUID produtoId;

    @Column(nullable = false)
    private Integer quantidade;
}
