CREATE TABLE IF NOT EXISTS del_delivery (
    id INT PRIMARY KEY,
    pedido_id INT,
    status_entrega VARCHAR(14),
    date_create DATE,
    sending_data DATE,
    delivery_date DATE,
    tracking_code INT,
    transport_id INT
);

    @Enumerated(EnumType.STRING) // Salva como texto no banco (PENDENTE, etc.)
    @Column
    private DeliveryStatus status;


-- CREATE TABLE IF NOT EXISTS funcionario (
--     id INT PRIMARY KEY,
--     nome VARCHAR(200),
--     cpf VARCHAR(11)
-- );

-- CREATE TABLE IF NOT EXISTS empresa_funcionario (
--     empresa_id INT,
--     funcionario_id INT,
--     FOREIGN KEY (empresa_id) REFERENCES empresa(id),
--     FOREIGN KEY (funcionario_id) REFERENCES funcionario(id),
--     PRIMARY KEY (empresa_id, funcionario_id)
-- );

-- INSERT INTO empresa (id, razao_social, cnpj)
-- SELECT 1, 'empresa A', '12345678912345'
--     WHERE NOT EXISTS (SELECT 1 FROM empresa WHERE id = 1);

-- INSERT INTO funcionario (id, nome, cpf)
-- SELECT 1, 'fulano', '12345678914'
--     WHERE NOT EXISTS (SELECT 1 FROM funcionario WHERE id = 1);

