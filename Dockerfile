# Define a imagem base
FROM openjdk

# Define o diretório de trabalho dentro do contêiner
WORKDIR /app

# Copia o arquivo JAR para o contêiner
COPY target/gestao-laboratorios-api-0.0.1-SNAPSHOT.jar /app/gestao-laboratorios.jar

# Define o comando padrão a ser executado quando o contêiner for iniciado
CMD ["java", "-jar", "gestao-laboratorios.jar"]

