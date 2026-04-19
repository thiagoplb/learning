package com.jb.supermercado.internal.produto.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

public record ProdutoRequestRecord(
        @NotBlank(message = "O campo nome é obrigatório")
        String nome,

        @NotBlank(message = "O campo descrição é obrigatório")
        String descricao,

        @NotNull(message = "O campo preço é obrigatório")
        @Positive(message = "O preço deve ser maior que zero")
        double preco,

        @NotNull(message = "O campo quantidade em estoque é obrigatório")
        @PositiveOrZero(message = "A quantidade em estoque não pode ser negativa")
        int quantidadeEstoque,

        @NotBlank(message = "O campo status é obrigatório")
        String status) {
}
