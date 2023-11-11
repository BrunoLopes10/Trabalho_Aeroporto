
                                       Sistema de Controle de Aeroporto
                                       
Um aeroporto deseja desenvolver um sistema de controle que gerencie voos e passageiros. Para os
passageiros, o sistema deve permitir a reserva de voos, check-in de passageiros e exibir informações
sobre os voos. O sistema também deve permitir que um usuário com permissão de administrador
realize o processamento das reservas.
Ao acessar o sistema, o usuário terá acesso a uma lista de opções, permitindo que ele realize a
reserva de voos, realize o check-in e visualize informações sobre os voos.
Os voos devem ser armazenados em uma lista. Cada voo deve conter informações como número do
voo, origem, destino, horário de partida, horário de chegada e quantidade máxima de passageiros. O
número do novo deve conter, obrigatoriamente, 4 algarismos de tamanho, exemplo: 2904
Os passageiros devem poder reservar um voo específico. Ao realizar uma reserva, o sistema deve
solicitar que o passageiro forneça seu nome, idade, CPF e um e-mail válido. Utilize uma fila para
gerenciar as reservas pendentes. "Reservas pendentes" se refere ao estado intermediário das
reservas de voos, onde os passageiros expressaram interesse, mas a reserva ainda não foi finalizada
ou confirmada pelo sistema. As reservas apenas são confirmadas após um usuário com perfil de
administrador realizar o processamento das reservas (o processamento deve ser realizado pelo
sistema).
Os passageiros devem poder fazer o check-in para um voo reservado.
Utilize uma pilha para gerenciar os passageiros que fizeram o check-in.
O sistema deve fornecer informações sobre todos os voos, incluindo os voos disponíveis, os voos com
reservas pendentes e os voos cheios
