/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esocial.infoempregador;

/**
 *
 * @author Ivo
 */
public class S1_0 {
   /**
    * S-2210 - Comunicação de Acidente de Trabalho
    *
    */
   ESocial eSocial;

   public static class Tipos {
      /**
       * Informações de identificação do evento.
       *
       */
      public static class T_ideEvento_evtTab {
         /**
          * Identificação do ambiente.
          *
          */
         String tpAmb;

         /**
          * Processo de emissão do evento.
          *
          */
         String procEmi;

         /**
          * Versão do processo de emissão do evento. Informar a versão do aplicativo emissor do evento.
          *
          */
         String verProc;

      }

      /**
       * Informações de identificação do evento.
       *
       * <p>CHAVE_GRUPO: {indApuracao}, {perApur}, {indGuia}</p>
       */
      public static class T_ideEvento_folha {
         /**
          * Informe [1] para arquivo original ou [2] para arquivo de retificação.
          *
          */
         String indRetif;

         /**
          * Preencher com o número do recibo do arquivo a ser retificado.
          *
          * <p>Validação: O preenchimento é obrigatório se {indRetif}(./indRetif) = [2].</p>
          * <p>Deve ser um recibo de entrega válido, correspondente ao arquivo que está sendo retificado.</p>
          */
         String nrRecibo;

         /**
          * Indicativo de período de apuração.
          *
          */
         String indApuracao;

         /**
          * Informar o mês/ano (formato AAAA-MM) de referência das informações, se {indApuracao}(./indApuracao) for igual a [1], ou apenas o ano (formato AAAA), se {indApuracao}(./indApuracao) for igual a [2].
          *
          * <p>Validação: Deve ser um mês/ano ou ano válido, igual ou posterior ao início da obrigatoriedade dos eventos periódicos para o empregador.</p>
          */
         String perApur;

         /**
          * Indicativo do tipo de guia.
          *
          */
         String indGuia;

         /**
          * Identificação do ambiente.
          *
          */
         String tpAmb;

         /**
          * Processo de emissão do evento.
          *
          */
         String procEmi;

         /**
          * Versão do processo de emissão do evento. Informar a versão do aplicativo emissor do evento.
          *
          */
         String verProc;

      }

      /**
       * Informações de identificação do evento.
       *
       * <p>CHAVE_GRUPO: {indApuracao}, {perApur}</p>
       */
      public static class T_ideEvento_folha_opp {
         /**
          * Informe [1] para arquivo original ou [2] para arquivo de retificação.
          *
          */
         String indRetif;

         /**
          * Preencher com o número do recibo do arquivo a ser retificado.
          *
          * <p>Validação: O preenchimento é obrigatório se {indRetif}(./indRetif) = [2].</p>
          * <p>Deve ser um recibo de entrega válido, correspondente ao arquivo que está sendo retificado.</p>
          */
         String nrRecibo;

         /**
          * Indicativo de período de apuração.
          *
          */
         String indApuracao;

         /**
          * Informar o mês/ano (formato AAAA-MM) de referência das informações, se {indApuracao}(./indApuracao) for igual a [1], ou apenas o ano (formato AAAA), se {indApuracao}(./indApuracao) for igual a [2].
          *
          * <p>Validação: Deve ser um mês/ano ou ano válido, igual ou posterior ao início da obrigatoriedade dos eventos periódicos para o empregador.</p>
          */
         String perApur;

         /**
          * Identificação do ambiente.
          *
          */
         String tpAmb;

         /**
          * Processo de emissão do evento.
          *
          */
         String procEmi;

         /**
          * Versão do processo de emissão do evento. Informar a versão do aplicativo emissor do evento.
          *
          */
         String verProc;

      }

      /**
       * Informações de identificação do evento.
       *
       * <p>CHAVE_GRUPO: {perApur}, {indGuia}</p>
       */
      public static class T_ideEvento_folha_mensal {
         /**
          * Informe [1] para arquivo original ou [2] para arquivo de retificação.
          *
          */
         String indRetif;

         /**
          * Preencher com o número do recibo do arquivo a ser retificado.
          *
          * <p>Validação: O preenchimento é obrigatório se {indRetif}(./indRetif) = [2].</p>
          * <p>Deve ser um recibo de entrega válido, correspondente ao arquivo que está sendo retificado.</p>
          */
         String nrRecibo;

         /**
          * Informar o mês/ano (formato AAAA-MM) de referência das informações.
          *
          * <p>Validação: Deve ser um mês/ano válido, igual ou posterior ao início da obrigatoriedade dos eventos periódicos para o empregador.</p>
          */
         String perApur;

         /**
          * Indicativo do tipo de guia.
          *
          */
         String indGuia;

         /**
          * Identificação do ambiente.
          *
          */
         String tpAmb;

         /**
          * Processo de emissão do evento.
          *
          */
         String procEmi;

         /**
          * Versão do processo de emissão do evento. Informar a versão do aplicativo emissor do evento.
          *
          */
         String verProc;

      }

      /**
       * Informações de identificação do evento.
       *
       * <p>CHAVE_GRUPO: {indApuracao}, {perApur}, {indGuia}</p>
       */
      public static class T_ideEvento_folha_sem_retificacao {
         /**
          * Indicativo de período de apuração.
          *
          */
         String indApuracao;

         /**
          * Informar o mês/ano (formato AAAA-MM) de referência das informações, se {indApuracao}(./indApuracao) for igual a [1], ou apenas o ano (formato AAAA), se {indApuracao}(./indApuracao) for igual a [2].
          *
          * <p>Validação: Deve ser um mês/ano ou ano válido, igual ou posterior ao início da obrigatoriedade dos eventos periódicos para o empregador.</p>
          */
         String perApur;

         /**
          * Indicativo do tipo de guia.
          *
          */
         String indGuia;

         /**
          * Identificação do ambiente.
          *
          */
         String tpAmb;

         /**
          * Processo de emissão do evento.
          *
          */
         String procEmi;

         /**
          * Versão do processo de emissão do evento. Informar a versão do aplicativo emissor do evento.
          *
          */
         String verProc;

      }

      /**
       * Informações de identificação do evento.
       *
       */
      public static class T_ideEvento_trab {
         /**
          * Informe [1] para arquivo original ou [2] para arquivo de retificação.
          *
          */
         String indRetif;

         /**
          * Preencher com o número do recibo do arquivo a ser retificado.
          *
          * <p>Validação: O preenchimento é obrigatório se {indRetif}(./indRetif) = [2].</p>
          * <p>Deve ser um recibo de entrega válido, correspondente ao arquivo que está sendo retificado.</p>
          */
         String nrRecibo;

         /**
          * Identificação do ambiente.
          *
          */
         String tpAmb;

         /**
          * Processo de emissão do evento.
          *
          */
         String procEmi;

         /**
          * Versão do processo de emissão do evento. Informar a versão do aplicativo emissor do evento.
          *
          */
         String verProc;

      }

      /**
       * Informações de identificação do evento.
       *
       */
      public static class T_ideEvento_trab_indGuia {
         /**
          * Informe [1] para arquivo original ou [2] para arquivo de retificação.
          *
          */
         String indRetif;

         /**
          * Preencher com o número do recibo do arquivo a ser retificado.
          *
          * <p>Validação: O preenchimento é obrigatório se {indRetif}(./indRetif) = [2].</p>
          * <p>Deve ser um recibo de entrega válido, correspondente ao arquivo que está sendo retificado.</p>
          */
         String nrRecibo;

         /**
          * Indicativo do tipo de guia.
          *
          */
         String indGuia;

         /**
          * Identificação do ambiente.
          *
          */
         String tpAmb;

         /**
          * Processo de emissão do evento.
          *
          */
         String procEmi;

         /**
          * Versão do processo de emissão do evento. Informar a versão do aplicativo emissor do evento.
          *
          */
         String verProc;

      }

      /**
       * Identificação do evento de retorno.
       *
       */
      public static class T_ideEvento_retorno_trab {
         /**
          * Preencher com o número do recibo do arquivo que deu origem ao presente arquivo de retorno ao empregador.
          *
          * <p>Validação: Deve ser um recibo de entrega válido, correspondente ao arquivo que deu origem ao presente arquivo de retorno (S-1200, S-2299, S-2399 ou S-3000).</p>
          */
         String nrRecArqBase;

         /**
          * Indicativo de período de apuração.
          *
          */
         String indApuracao;

         /**
          * Informar o mês/ano (formato AAAA-MM) de referência das informações, se {indApuracao}(./indApuracao) for igual a [1], ou apenas o ano (formato AAAA), se {indApuracao}(./indApuracao) for igual a [2].
          *
          */
         String perApur;

      }

      /**
       * Identificação do evento de retorno.
       *
       * <p>DESCRICAO_COMPLETA:Identificação do evento de retorno.</p>
       * <p>Evento de origem: S-1299.</p>
       */
      public static class T_ideEvento_retorno_contrib {
         /**
          * Indicativo de período de apuração.
          *
          */
         String indApuracao;

         /**
          * Informar o mês/ano (formato AAAA-MM) de referência das informações, se {indApuracao}(./indApuracao) for igual a [1], ou apenas o ano (formato AAAA), se {indApuracao}(./indApuracao) for igual a [2].
          *
          */
         String perApur;

      }

      /**
       * Informações de identificação do empregador.
       *
       * <p>CHAVE_GRUPO: {tpInsc}, {nrInsc}</p>
       */
      public static class T_ideEmpregador {
         /**
          * Preencher com o código correspondente ao tipo de inscrição, conforme Tabela 05.
          *
          */
         String tpInsc;

         /**
          * Informar o número de inscrição do contribuinte de acordo com o tipo de inscrição indicado no campo {ideEmpregador/tpInsc}(./tpInsc) e conforme informado em S-1000.
          *
          */
         String nrInsc;

      }

      /**
       * Informações de identificação do empregador.
       *
       * <p>CHAVE_GRUPO: {tpInsc}, {nrInsc}</p>
       */
      public static class T_ideEmpregador_cnpj {
         /**
          * Preencher com o código correspondente ao tipo de inscrição, conforme Tabela 05.
          *
          */
         String tpInsc;

         /**
          * Informar o número de inscrição do contribuinte de acordo com o tipo de inscrição indicado no campo {ideEmpregador/tpInsc}(./tpInsc) e conforme informado em S-1000.
          *
          */
         String nrInsc;

      }

      /**
       * Novo período de validade das informações.
       *
       * <p>DESCRICAO_COMPLETA:Informação preenchida exclusivamente em caso de alteração do período de validade das informações, apresentando o novo período de validade.</p>
       * <p>CONDICAO_GRUPO: OC</p>
       */
      public static class T_novaValidade {
         /**
          * Preencher com o mês e ano de início da validade das informações prestadas no evento, no formato AAAA-MM.
          *
          * <p>Validação: Deve ser uma data válida, igual ou posterior à data de início de obrigatoriedade deste evento para o empregador no eSocial, no formato AAAA-MM.</p>
          */
         String iniValid;

         /**
          * Preencher com o mês e ano de término da validade das informações, se houver.
          *
          * <p>Validação: Se informado, deve estar no formato AAAA-MM e ser um período igual ou posterior a {iniValid}(./iniValid).</p>
          */
         String fimValid;

      }

      /**
       * Informações sobre a existência de processos judiciais do trabalhador
       *
       * <p>DESCRICAO_COMPLETA:Informações sobre a existência de processos judiciais do trabalhador com decisão favorável quanto à não incidência de contribuições sociais e/ou Imposto de Renda.</p>
       * <p>CHAVE_GRUPO: {tpTrib}, {nrProcJud}, {codSusp}</p>
       * <p>CONDICAO_GRUPO: OC</p>
       */
      public static class T_procJudTrab {
         /**
          * Abrangência da decisão.
          *
          */
         String tpTrib;

         /**
          * Informar um número de processo judicial cadastrado através do evento S-1070, cujo {indMatProc}(1070_infoProcesso_inclusao_dadosProc_indMatProc) seja igual a [1].
          *
          * <p>Validação: Deve ser um número de processo judicial válido e existente na Tabela de Processos (S-1070), com {indMatProc}(1070_infoProcesso_inclusao_dadosProc_indMatProc) = [1].</p>
          */
         String nrProcJud;

         /**
          * Código do indicativo da suspensão, atribuído pelo empregador em S-1070.
          *
          * <p>Validação: A informação prestada deve estar de acordo com o que foi informado em S-1070.</p>
          */
         Integer codSusp;

      }

      public static class T_infoInterm {
         /**
          * Dia do mês efetivamente trabalhado pelo empregado com contrato de trabalho intermitente.
          *
          * <p>Validação: Deve ser um número entre 1 e 31, de acordo com o calendário anual.</p>
          */
         String dia;

      }

      /**
       * Itens da remuneração do trabalhador
       *
       * <p>DESCRICAO_COMPLETA:Rubricas que compõem a remuneração do trabalhador.</p>
       */
      public static class T_itensRemun_rpps {
         /**
          * Informar o código atribuído pelo empregador que identifica a rubrica em sua folha de pagamento.
          *
          */
         String codRubr;

         /**
          * Preencher com o identificador da Tabela de Rubricas para a rubrica definida em {codRubr}(./codRubr).
          *
          */
         String ideTabRubr;

         /**
          * Informar a quantidade de referência para apuração (em horas, cotas, meses, etc.).
          *
          * <p>Preenchimento obrigatório quando se tratar de rubrica relativa a faltas ou Descanso Semanal Remunerado - DSR sobre faltas (nesse caso, informar a quantidade de dias).</p>
          * <p>Validação: Deve ser maior que 0 (zero). Informação obrigatória se {codRubr}(./codRubr) tiver {natRubr}(1010_infoRubrica_inclusao_dadosRubrica_natRubr) em S-1010 igual a [9207, 9211].</p>
          */
         Double qtdRubr;

         /**
          * Informar o fator, percentual, etc. da rubrica, quando necessário.
          *
          * <p>Validação: Deve ser maior que 0 (zero).</p>
          */
         Double fatorRubr;

         /**
          * Valor total da rubrica.
          *
          * <p>Validação: Deve ser maior que 0 (zero).</p>
          */
         Double vrRubr;

         /**
          * Indicativo de tipo de apuração de IR.
          *
          */
         String indApurIR;

      }

      /**
       * Grupo de informações do nascimento do trabalhador.
       *
       */
      public static class T_nascimento {
         /**
          * Preencher com a data de nascimento.
          *
          */
         javax.xml.datatype.XMLGregorianCalendar dtNascto;

         /**
          * Preencher com o código do país de nascimento do trabalhador.
          *
          * <p>Validação: Deve ser um código válido e existente na Tabela 06.</p>
          */
         String paisNascto;

         /**
          * Preencher com o código do país de nacionalidade do trabalhador.
          *
          * <p>Validação: Deve ser um código válido e existente na Tabela 06.</p>
          */
         String paisNac;

      }

      /**
       * Endereço no Brasil.
       *
       * <p>CONDICAO_GRUPO: O (se não informado o grupo {exterior}(../exterior)); N (nos demais casos)</p>
       */
      public static class T_endereco_brasil {
         /**
          * Tipo de logradouro.
          *
          * <p>Validação: Se informado, deve ser um código válido e existente na Tabela 20.</p>
          */
         String tpLograd;

         /**
          * Descrição do logradouro.
          *
          */
         String dscLograd;

         /**
          * Número do logradouro.
          *
          * <p>Se não houver número a ser informado, preencher com "S/N".</p>
          */
         String nrLograd;

         /**
          * Complemento do logradouro.
          *
          */
         String complemento;

         /**
          * Nome do bairro/distrito.
          *
          */
         String bairro;

         /**
          * Código de Endereçamento Postal - CEP.
          *
          * <p>Validação: Deve ser preenchido apenas com números, com 8 (oito) posições.</p>
          */
         String cep;

         /**
          * Preencher com o código do município, conforme tabela do IBGE.
          *
          * <p>Validação: Deve ser um código válido e existente na tabela do IBGE.</p>
          */
         Integer codMunic;

         /**
          * Preencher com a sigla da Unidade da Federação - UF.
          *
          */
         String uf;

      }

      /**
       * Endereço no exterior.
       *
       * <p>CONDICAO_GRUPO: O (se não informado o grupo {brasil}(../brasil)); N (nos demais casos)</p>
       */
      public static class T_endereco_exterior {
         /**
          * Preencher com o código do país.
          *
          * <p>Validação: Deve ser um código válido e existente na Tabela 06.</p>
          */
         String paisResid;

         /**
          * Descrição do logradouro.
          *
          */
         String dscLograd;

         /**
          * Número do logradouro.
          *
          * <p>Se não houver número a ser informado, preencher com "S/N".</p>
          */
         String nrLograd;

         /**
          * Complemento do logradouro.
          *
          */
         String complemento;

         /**
          * Nome do bairro/distrito.
          *
          */
         String bairro;

         /**
          * Nome da cidade.
          *
          */
         String nmCid;

         /**
          * Código de Endereçamento Postal.
          *
          */
         String codPostal;

      }

      public static class T_contato {
         /**
          * Número de telefone do trabalhador, com DDD.
          *
          * <p>Validação: Se preenchido, deve conter apenas números, com o mínimo de dez dígitos.</p>
          */
         String fonePrinc;

         /**
          * Endereço eletrônico.
          *
          * <p>Validação: O e-mail deve ser possuir o caractere "@" e este não pode estar no início e no fim do e-mail. Deve possuir no mínimo um caractere "." depois do @ e não pode estar no início ou no final do e-mail.</p>
          */
         String emailPrinc;

      }

      public static class T_aprend {
         /**
          * Preencher com o código correspondente ao tipo de inscrição, conforme Tabela 05.
          *
          */
         String tpInsc;

         /**
          * Informar o número de inscrição do estabelecimento para o qual a contratação de aprendiz foi efetivada, de acordo com o tipo de inscrição indicado no campo {aprend/tpInsc}(./tpInsc).
          *
          * <p>Validação: Deve ser um identificador válido e:</p>
          * <p>a) Se {aprend/tpInsc}(./tpInsc) = [1], deve ser informado com 14 (catorze) algarismos. Se o empregador for pessoa jurídica, a raiz do CNPJ informado deve ser diferente de {ideEmpregador/nrInsc}(/ideEmpregador_nrInsc).</p>
          * <p>b) Se {aprend/tpInsc}(./tpInsc) = [2], deve ser diferente do CPF do empregado. Se o empregador for pessoa física, também deve ser diferente do CPF do empregador.</p>
          */
         String nrInsc;

      }

      public static class T_remuneracao {
         /**
          * Salário base do trabalhador, correspondente à parte fixa da remuneração.
          *
          * <p>Validação: Se {undSalFixo}(./undSalFixo) for igual a [7], preencher com 0 (zero).</p>
          */
         Double vrSalFx;

         /**
          * Unidade de pagamento da parte fixa da remuneração.
          *
          */
         String undSalFixo;

         /**
          * Descrição do salário por tarefa ou variável e como este é calculado. Ex.: Comissões pagas no percentual de 10% sobre as vendas.
          *
          * <p>Validação: Preenchimento obrigatório se {undSalFixo}(./undSalFixo) for igual a [6, 7].</p>
          */
         String dscSalVar;

      }

      public static class T_localTrabGeral {
         /**
          * Preencher com o código correspondente ao tipo de inscrição, conforme Tabela 05.
          *
          */
         String tpInsc;

         /**
          * Informar o número de inscrição do contribuinte de acordo com o tipo de inscrição indicado no campo {localTrabGeral/tpInsc}(./tpInsc).
          *
          * <p>Validação: Deve ser um número de inscrição válido e existente na Tabela de Estabelecimentos (S-1005), bem como compatível com {localTrabGeral/tpInsc}(./tpInsc).</p>
          */
         String nrInsc;

         /**
          * Descrição complementar do local de trabalho.
          *
          */
         String descComp;

      }

      public static class T_horContratual {
         /**
          * Quantidade média de horas relativas à jornada semanal do trabalhador.
          *
          * <p>Validação: Deve ser preenchida se {codCateg}(../codCateg) for diferente de [111]. Se informada, deve ser maior que 0 (zero).</p>
          */
         Double qtdHrsSem;

         /**
          * Tipo de jornada.
          *
          */
         String tpJornada;

         /**
          * Preencher com o código relativo ao tipo de contrato em tempo parcial.
          *
          * <p>Validação: O código [1] só é válido se {codCateg}(../codCateg) = [104]. Os códigos [2, 3] não são válidos se {codCateg}(../codCateg) = [104].</p>
          */
         String tmpParc;

         /**
          * Indicar se a jornada semanal possui horário noturno (no todo ou em parte).
          *
          */
         String horNoturno;

         /**
          * Descrição da jornada semanal contratual, contendo os dias da semana e os respectivos horários contratuais (entrada, saída e intervalos).
          *
          */
         String dscJorn;

      }

      public static class T_alvaraJudicial {
         /**
          * Preencher com o número do processo judicial.
          *
          * <p>Validação: Deve ser um número de processo judicial válido.</p>
          */
         String nrProcJud;

      }

      public static class T_treiCap {
         /**
          * Informar o código do treinamento, capacitação, exercício simulado ou outra anotação, conforme Tabela 28.
          *
          * <p>Validação: Deve ser um código válido e existente na Tabela 28.</p>
          */
         Integer codTreiCap;

      }

      /**
       * Informações de identificação do trabalhador e do vínculo.
       *
       * <p>CHAVE_GRUPO: {cpfTrab}, {matricula}</p>
       */
      public static class T_ideVinculo {
         /**
          * Preencher com o número do CPF do trabalhador.
          *
          */
         String cpfTrab;

         /**
          * Matrícula atribuída ao trabalhador pela empresa ou, no caso de servidor público, a matrícula constante no Sistema de Administração de Recursos Humanos do órgão.
          *
          * <p>Validação: Deve corresponder à matrícula informada pelo empregador no evento S-2200 do respectivo vínculo trabalhista.</p>
          */
         String matricula;

      }

      /**
       * Informações de identificação do trabalhador e do vínculo.
       *
       * <p>CHAVE_GRUPO: {cpfTrab}, {matricula}, {codCateg}</p>
       */
      public static class T_ideVinculo_sst {
         /**
          * Preencher com o número do CPF do trabalhador.
          *
          */
         String cpfTrab;

         /**
          * Matrícula atribuída ao trabalhador pela empresa ou, no caso de servidor público, a matrícula constante no Sistema de Administração de Recursos Humanos do órgão.
          *
          * <p>Validação: Deve corresponder à matrícula informada pelo empregador no evento S-2190, S-2200 ou S-2300 do respectivo contrato. Não preencher no caso de Trabalhador Sem Vínculo de Emprego/Estatutário - TSVE sem informação de matrícula no evento S-2300.</p>
          */
         String matricula;

         /**
          * Preencher com o código da categoria do trabalhador.
          *
          * <p>Informar somente no caso de TSVE sem informação de matrícula no evento S-2300.</p>
          * <p>Validação: Informação obrigatória e exclusiva se não houver preenchimento de {matricula}(./matricula). Se informado, deve ser um código válido e existente na Tabela 01.</p>
          */
         Integer codCateg;

      }

      /**
       * Identificação do TSVE
       *
       * <p>DESCRICAO_COMPLETA:Identificação do Trabalhador Sem Vínculo de Emprego/Estatutário - TSVE.</p>
       * <p>CHAVE_GRUPO: {cpfTrab}, {matricula}, {codCateg}</p>
       */
      public static class T_ideTrabSemVinculo {
         /**
          * Preencher com o número do CPF do trabalhador.
          *
          */
         String cpfTrab;

         /**
          * Matrícula atribuída ao trabalhador pela empresa.
          *
          * <p>Validação: Deve corresponder à matrícula informada pelo empregador no evento S-2300 do respectivo contrato. Não preencher no caso de TSVE sem informação de matrícula no evento S-2300.</p>
          */
         String matricula;

         /**
          * Preencher com o código da categoria do trabalhador.
          *
          * <p>Informar somente no caso de TSVE sem informação de matrícula no evento S-2300.</p>
          * <p>Validação: Informação obrigatória e exclusiva se não houver preenchimento de {matricula}(./matricula). Se informado, deve ser um código válido e existente na Tabela 01.</p>
          */
         Integer codCateg;

      }

      /**
       * Informação relativa a empresas do Simples
       *
       * <p>DESCRICAO_COMPLETA:Informação relativa a empresas enquadradas no regime de tributação Simples Nacional.</p>
       * <p>CONDICAO_GRUPO: O (se {classTrib}(1000_infoEmpregador_inclusao_infoCadastro_classTrib) em S-1000 = [03]); N (nos demais casos)</p>
       */
      public static class T_infoSimples {
         /**
          * Indicador de contribuição substituída.
          *
          */
         String indSimples;

      }

      /**
       * Informação de múltiplos vínculos
       *
       * <p>DESCRICAO_COMPLETA:Grupo preenchido exclusivamente em caso de trabalhador que possua outros vínculos/atividades nos quais já tenha ocorrido desconto de contribuição previdenciária.</p>
       * <p>CONDICAO_GRUPO: OC</p>
       */
      public static class T_infoMV {
         /**
          * Indicador de desconto da contribuição previdenciária do trabalhador.
          *
          */
         String indMV;

         /**
          * Remuneração recebida pelo trabalhador em outras empresas ou atividades
          *
          * <p>DESCRICAO_COMPLETA:Informações relativas ao trabalhador que possui vínculo empregatício com outra(s) empresa(s) e/ou que exerce outras atividades como contribuinte individual, detalhando as empresas que efetuaram (ou efetuarão) desconto da contribuição.</p>
          * <p>CHAVE_GRUPO: {tpInsc}, {nrInsc}, {codCateg}</p>
          */
         RemunOutrEmpr remunOutrEmpr;

         public static class RemunOutrEmpr {
            /**
             * Preencher com o código correspondente ao tipo de inscrição, conforme Tabela 05.
             *
             */
            String tpInsc;

            /**
             * Informar o número de inscrição do contribuinte de acordo com o tipo de inscrição indicado no campo {remunOutrEmpr/tpInsc}(./tpInsc).
             *
             * <p>Validação: a) Se {remunOutrEmpr/tpInsc}(./tpInsc) = [1], deve ser um CNPJ válido, diferente do CNPJ base indicado no evento de Informações do Empregador (S-1000) e dos estabelecimentos informados através do evento S-1005.</p>
             * <p>b) Se {remunOutrEmpr/tpInsc}(./tpInsc) = [2], deve ser um CPF válido e diferente do CPF do trabalhador e ainda, caso o empregador seja pessoa física, diferente do CPF do empregador.</p>
             */
            String nrInsc;

            /**
             * Preencher com o código da categoria do trabalhador na qual houve a remuneração.
             *
             * <p>Validação: Deve ser um código válido e existente na Tabela 01.</p>
             */
            Integer codCateg;

            /**
             * Preencher com o valor da remuneração recebida pelo trabalhador na outra empresa/atividade, sobre a qual houve desconto/recolhimento da contribuição do segurado.
             *
             * <p>Validação: Deve ser maior que 0 (zero).</p>
             */
            Double vlrRemunOE;

         }

      }

      public static class T_infoEstagiario {
         /**
          * Natureza do estágio.
          *
          */
         String natEstagio;

         /**
          * Informar o nível do estágio.
          *
          */
         String nivEstagio;

         /**
          * Área de atuação do estagiário.
          *
          */
         String areaAtuacao;

         /**
          * Número da apólice de seguro.
          *
          */
         String nrApol;

         /**
          * Data prevista para o término do estágio.
          *
          * <p>Validação: Deve ser uma data posterior à data de início do estágio.</p>
          */
         javax.xml.datatype.XMLGregorianCalendar dtPrevTerm;

         /**
          * Instituição de ensino.
          *
          */
         InstEnsino instEnsino;

         /**
          * Agente de integração.
          *
          * <p>CONDICAO_GRUPO: OC</p>
          */
         AgeIntegracao ageIntegracao;

         /**
          * Supervisor do estágio.
          *
          * <p>CONDICAO_GRUPO: OC</p>
          */
         SupervisorEstagio supervisorEstagio;

         public static class InstEnsino {
            /**
             * Preencher com o CNPJ da instituição de ensino. Deve ser preenchido apenas se a instituição de ensino for brasileira.
             *
             * <p>Validação: Se informado, deve ser um CNPJ válido, com 14 (catorze) algarismos.</p>
             */
            String cnpjInstEnsino;

            /**
             * Informar a razão social.
             *
             * <p>Validação: Preenchimento obrigatório e exclusivo se o campo {cnpjInstEnsino}(./cnpjInstEnsino) não estiver preenchido.</p>
             */
            String nmRazao;

            /**
             * Descrição do logradouro.
             *
             * <p>Validação: Preenchimento obrigatório e exclusivo se o campo {cnpjInstEnsino}(./cnpjInstEnsino) não estiver preenchido.</p>
             */
            String dscLograd;

            /**
             * Número do logradouro.
             *
             * <p>Se não houver número a ser informado, preencher com "S/N".</p>
             * <p>Validação: Preenchimento obrigatório e exclusivo se o campo {cnpjInstEnsino}(./cnpjInstEnsino) não estiver preenchido.</p>
             */
            String nrLograd;

            /**
             * Nome do bairro/distrito.
             *
             * <p>Validação: Preenchimento obrigatório e exclusivo se o campo {cnpjInstEnsino}(./cnpjInstEnsino) não estiver preenchido.</p>
             */
            String bairro;

            /**
             * Código de Endereçamento Postal - CEP.
             *
             * <p>Validação: Não informar se o campo {cnpjInstEnsino}(./cnpjInstEnsino) estiver preenchido. Se informado, deve ser preenchido apenas com números, com 8 (oito) posições.</p>
             */
            String cep;

            /**
             * Preencher com o código do município, conforme tabela do IBGE.
             *
             * <p>Validação: Não informar se o campo {cnpjInstEnsino}(./cnpjInstEnsino) estiver preenchido. Se informado, deve ser um código válido e existente na tabela do IBGE.</p>
             */
            Integer codMunic;

            /**
             * Preencher com a sigla da Unidade da Federação - UF.
             *
             * <p>Validação: Não informar se o campo {cnpjInstEnsino}(./cnpjInstEnsino) estiver preenchido.</p>
             */
            String uf;

         }

         public static class AgeIntegracao {
            /**
             * CNPJ do agente de integração.
             *
             * <p>Validação: Deve ser um CNPJ válido, com 14 (catorze) algarismos.</p>
             */
            String cnpjAgntInteg;

         }

         public static class SupervisorEstagio {
            /**
             * CPF do responsável pela supervisão do estagiário.
             *
             * <p>Validação: Deve ser um CPF válido.</p>
             */
            String cpfSupervisor;

         }

      }

      /**
       * Identificação do beneficiário e do benefício.
       *
       * <p>CHAVE_GRUPO: {cpfBenef}, {nrBeneficio}</p>
       */
      public static class T_ideBeneficio {
         /**
          * Informar o CPF do beneficiário.
          *
          */
         String cpfBenef;

         /**
          * Número do benefício.
          *
          */
         String nrBeneficio;

      }

      public static class T_sucessaoVinc {
         /**
          * Preencher com o código correspondente ao tipo de inscrição, conforme Tabela 05.
          *
          */
         String tpInsc;

         /**
          * Informar o número de inscrição do empregador anterior, de acordo com o tipo de inscrição indicado no campo {sucessaoVinc/tpInsc}(./tpInsc).
          *
          */
         String nrInsc;

         /**
          * Matrícula do trabalhador no empregador anterior.
          *
          */
         String matricAnt;

         /**
          * Preencher com a data de admissão do trabalhador. No caso de transferência do empregado, deve ser preenchida a data inicial do vínculo no primeiro empregador (data de início do vínculo).
          *
          */
         javax.xml.datatype.XMLGregorianCalendar dtAdm;

      }

   }

   public static class ESocial {
      /**
       * Evento Comunicação de Acidente de Trabalho.
       *
       * <p>CHAVE_GRUPO: {Id}</p>
       * <p>REGRA:REGRA_EMPREGADO_DOMESTICO</p>
       * <p>REGRA:REGRA_ENVIO_PROC_FECHAMENTO</p>
       * <p>REGRA:REGRA_EVENTOS_EXTEMP</p>
       * <p>REGRA:REGRA_EVENTO_EXT_SEM_IMPACTO_FOPAG</p>
       * <p>REGRA:REGRA_EVENTO_POSTERIOR_CAT_OBITO</p>
       * <p>REGRA:REGRA_EXCLUI_EVENTO_CAT</p>
       * <p>REGRA:REGRA_EXISTE_CAT_ORIGEM</p>
       * <p>REGRA:REGRA_EXISTE_INFO_EMPREGADOR</p>
       * <p>REGRA:REGRA_EXTEMP_REINTEGRACAO</p>
       * <p>REGRA:REGRA_GERAL_VALIDA_DADOS_TABCONTRIB</p>
       * <p>REGRA:REGRA_MESMO_PROCEMI</p>
       * <p>REGRA:REGRA_RETIFICA_DT_ACIDENTE</p>
       * <p>REGRA:REGRA_RETIFICA_MESMO_VINCULO</p>
       * <p>REGRA:REGRA_TSV_ATIVO_NA_DTEVENTO</p>
       * <p>REGRA:REGRA_VINCULO_ATIVO_NA_DTEVENTO</p>
       */
      EvtCAT evtCAT;

      //Tipos.Signature signature;

      public static class EvtCAT {
         Tipos.T_ideEvento_trab ideEvento;

         Tipos.T_ideEmpregador ideEmpregador;

         Tipos.T_ideVinculo_sst ideVinculo;

         /**
          * CAT
          *
          * <p>DESCRICAO_COMPLETA:Comunicação de Acidente de Trabalho - CAT.</p>
          * <p>CHAVE_GRUPO: {dtAcid}, {hrAcid}, {tpCat}</p>
          */
         Cat cat;

         public static class Cat {
            /**
             * Data do acidente.
             *
             * <p>Validação: Deve ser uma data válida, igual ou anterior à data atual e igual ou posterior à data de admissão do trabalhador e à data de início da obrigatoriedade deste evento para o empregador no eSocial.</p>
             * <p>Se {tpCat}(./tpCat) = [2, 3], deve ser informado valor igual ao preenchido no evento de CAT anterior, quando informado em {nrRecCatOrig}(./catOrigem_nrRecCatOrig).</p>
             */
            javax.xml.datatype.XMLGregorianCalendar dtAcid;

            /**
             * Tipo de acidente de trabalho.
             *
             */
            String tpAcid;

            /**
             * Hora do acidente, no formato HHMM.
             *
             * <p>Validação: Preenchimento obrigatório e exclusivo se {tpAcid}(./tpAcid) = [1]. Se informada, deve estar no intervalo entre [0000] e [2359], criticando inclusive a segunda parte do número, que indica os minutos, que deve ser menor ou igual a 59.</p>
             * <p>Se {tpCat}(./tpCat) = [2, 3], deve ser informado valor igual ao preenchido no evento de CAT anterior, quando informado em {nrRecCatOrig}(./catOrigem_nrRecCatOrig).</p>
             */
            Integer hrAcid;

            /**
             * Horas trabalhadas antes da ocorrência do acidente, no formato HHMM.
             *
             * <p>Validação: Preenchimento obrigatório e exclusivo se {tpAcid}(./tpAcid) = [1]. Se informada, deve estar no intervalo entre [0000] e [9959], criticando inclusive a segunda parte do número, que indica os minutos, que deve ser menor ou igual a 59.</p>
             */
            Integer hrsTrabAntesAcid;

            /**
             * Tipo de CAT.
             *
             */
            String tpCat;

            /**
             * Houve óbito?
             *
             * <p>Validação: Se o {tpCat}(./tpCat) for igual a [3], o campo deverá sempre ser preenchido com [S]. Se o {tpCat}(./tpCat) for igual a [2], o campo deverá sempre ser preenchido com [N].</p>
             */
            String indCatObito;

            /**
             * Data do óbito.
             *
             * <p>Validação: Deve ser uma data válida, igual ou posterior a {dtAcid}(./dtAcid) e igual ou anterior à data atual.</p>
             * <p>Preenchimento obrigatório e exclusivo se {indCatObito}(./indCatObito) = [S].</p>
             */
            javax.xml.datatype.XMLGregorianCalendar dtObito;

            /**
             * Houve comunicação à autoridade policial?
             *
             */
            String indComunPolicia;

            /**
             * Preencher com o código da situação geradora do acidente ou da doença profissional.
             *
             * <p>Validação: Deve ser um código válido e existente na Tabela 15 ou na Tabela 16.</p>
             */
            Integer codSitGeradora;

            /**
             * Iniciativa da CAT.
             *
             */
            String iniciatCAT;

            /**
             * Observação.
             *
             */
            String obsCAT;

            /**
             * Local do acidente.
             *
             */
            LocalAcidente localAcidente;

            /**
             * Parte do corpo atingida.
             *
             * <p>DESCRICAO_COMPLETA:Detalhamento da parte atingida pelo acidente de trabalho.</p>
             */
            ParteAtingida parteAtingida;

            /**
             * Agente causador.
             *
             * <p>DESCRICAO_COMPLETA:Detalhamento do agente causador do acidente de trabalho.</p>
             */
            AgenteCausador agenteCausador;

            /**
             * Atestado médico.
             *
             * <p>CONDICAO_GRUPO: OC</p>
             */
            Atestado atestado;

            /**
             * CAT de origem
             *
             * <p>DESCRICAO_COMPLETA:Grupo que indica a CAT anterior, no caso de CAT de reabertura ou de comunicação de óbito.</p>
             * <p>CHAVE_GRUPO: {nrRecCatOrig}</p>
             * <p>CONDICAO_GRUPO: O (se {tpCat}(../tpCat) for igual a [2, 3]); N (nos demais casos)</p>
             */
            CatOrigem catOrigem;

            public static class LocalAcidente {
               /**
                * Tipo de local do acidente.
                *
                */
               String tpLocal;

               /**
                * Especificação do local do acidente (pátio, rampa de acesso, posto de trabalho, etc.).
                *
                */
               String dscLocal;

               /**
                * Tipo de logradouro.
                *
                * <p>Validação: Se informado, deve ser um código válido e existente na Tabela 20.</p>
                */
               String tpLograd;

               /**
                * Descrição do logradouro.
                *
                */
               String dscLograd;

               /**
                * Número do logradouro.
                *
                * <p>Se não houver número a ser informado, preencher com "S/N".</p>
                */
               String nrLograd;

               /**
                * Complemento do logradouro.
                *
                */
               String complemento;

               /**
                * Nome do bairro/distrito.
                *
                */
               String bairro;

               /**
                * Código de Endereçamento Postal - CEP.
                *
                * <p>Validação: Preenchimento obrigatório se {tpLocal}(./tpLocal) = [1, 3, 5]. Não preencher se {tpLocal}(./tpLocal) = [2].</p>
                * <p>Se preenchido, deve ser informado apenas com números, com 8 (oito) posições.</p>
                */
               String cep;

               /**
                * Preencher com o código do município, conforme tabela do IBGE.
                *
                * <p>Validação: Preenchimento obrigatório se {tpLocal}(./tpLocal) = [1, 3, 4, 5]. Não preencher se {tpLocal}(./tpLocal) = [2].</p>
                * <p>Se informado, deve ser um código válido e existente na tabela do IBGE.</p>
                */
               Integer codMunic;

               /**
                * Preencher com a sigla da Unidade da Federação - UF.
                *
                * <p>Validação: Preenchimento obrigatório se {tpLocal}(./tpLocal) = [1, 3, 4, 5]. Não preencher se {tpLocal}(./tpLocal) = [2].</p>
                */
               String uf;

               /**
                * Preencher com o código do país.
                *
                * <p>Validação: Deve ser um código de país válido e existente na Tabela 06.</p>
                * <p>Preenchimento obrigatório se {tpLocal}(./tpLocal) = [2]. Não preencher nos demais casos.</p>
                */
               String pais;

               /**
                * Código de Endereçamento Postal.
                *
                * <p>Validação: Preenchimento obrigatório se {tpLocal}(./tpLocal) = [2]. Não preencher nos demais casos.</p>
                */
               String codPostal;

               /**
                * Identificação do local onde ocorreu o acidente.
                *
                * <p>CONDICAO_GRUPO: O (se {ideEmpregador/tpInsc}(2210_ideEmpregador_tpInsc) = [1] e {tpLocal}(../tpLocal) = [1, 3]); OC (nos demais casos)</p>
                */
               IdeLocalAcid ideLocalAcid;

               public static class IdeLocalAcid {
                  /**
                   * Preencher com o código correspondente ao tipo de inscrição do local onde ocorreu o acidente ou a doença ocupacional, conforme Tabela 05.
                   *
                   */
                  String tpInsc;

                  /**
                   * Informar o número de inscrição do estabelecimento, de acordo com o tipo de inscrição indicado no campo {ideLocalAcid/tpInsc}(./tpInsc). Se o acidente ou a doença ocupacional ocorreu em local onde o trabalhador presta serviços, deve ser um número de inscrição pertencente à contratante dos serviços.
                   *
                   * <p>Validação: Deve ser compatível com o conteúdo do campo {ideLocalAcid/tpInsc}(./tpInsc). Deve ser um identificador válido, constante das bases da RFB, e:</p>
                   * <p>a) Se {tpLocal}(../tpLocal) = [1], deve ser válido e existente na Tabela de Estabelecimentos (S-1005);</p>
                   * <p>b) Se {tpLocal}(../tpLocal) = [3], deve ser diferente dos estabelecimentos informados na Tabela S-1005 e, se {ideLocalAcid/tpInsc}(./tpInsc) = [1], diferente do CNPJ base indicado em S-1000.</p>
                   */
                  String nrInsc;

               }

            }

            public static class ParteAtingida {
               /**
                * Preencher com o código correspondente à parte atingida.
                *
                * <p>Validação: Deve ser um código válido e existente na Tabela 13.</p>
                */
               Integer codParteAting;

               /**
                * Lateralidade da(s) parte(s) atingida(s).
                *
                * <p>Nos casos de órgãos bilaterais, ou seja, que se situam dos lados do corpo, assinalar o lado (direito ou esquerdo). Ex.: Caso o órgão atingido seja perna, apontar qual foi a atingida (perna direita, perna esquerda ou ambas). Se o órgão atingido é único (como, por exemplo, a cabeça), assinalar este campo como não aplicável.</p>
                */
               String lateralidade;

            }

            public static class AgenteCausador {
               /**
                * Preencher com o código correspondente ao agente causador do acidente.
                *
                * <p>Validação: Deve ser um código válido e existente na Tabela 14 ou na Tabela 15.</p>
                */
               Integer codAgntCausador;

            }

            public static class Atestado {
               /**
                * Data do atendimento.
                *
                * <p>Validação: Deve ser uma data válida, igual ou anterior à data atual.</p>
                */
               javax.xml.datatype.XMLGregorianCalendar dtAtendimento;

               /**
                * Hora do atendimento, no formato HHMM.
                *
                * <p>Validação: Deve estar no intervalo entre [0000] e [2359], criticando inclusive a segunda parte do número, que indica os minutos, que deve ser menor ou igual a 59.</p>
                */
               Integer hrAtendimento;

               /**
                * Indicativo de internação.
                *
                */
               String indInternacao;

               /**
                * Duração estimada do tratamento, em dias.
                *
                */
               Integer durTrat;

               /**
                * Indicativo de afastamento do trabalho durante o tratamento.
                *
                * <p>Validação: Se o campo {indCatObito}(../indCatObito) for igual a [S], o campo deve sempre ser preenchido com [N].</p>
                */
               String indAfast;

               /**
                * Preencher com a descrição da natureza da lesão.
                *
                * <p>Validação: Deve ser um código válido e existente na Tabela 17.</p>
                */
               Integer dscLesao;

               /**
                * Descrição complementar da lesão.
                *
                */
               String dscCompLesao;

               /**
                * Diagnóstico provável.
                *
                */
               String diagProvavel;

               /**
                * Informar o código da tabela de Classificação Internacional de Doenças - CID.
                *
                * <p>Validação: Deve ser preenchido com caracteres alfanuméricos, conforme opções constantes na tabela CID.</p>
                */
               String codCID;

               /**
                * Observação.
                *
                */
               String observacao;

               /**
                * Médico/Dentista que emitiu o atestado.
                *
                */
               Emitente emitente;

               public static class Emitente {
                  /**
                   * Nome do médico/dentista que emitiu o atestado.
                   *
                   */
                  String nmEmit;

                  /**
                   * Órgão de classe.
                   *
                   */
                  String ideOC;

                  /**
                   * Número de inscrição no órgão de classe.
                   *
                   */
                  String nrOC;

                  /**
                   * Sigla da UF do órgão de classe.
                   *
                   */
                  String ufOC;

               }

            }

            public static class CatOrigem {
               /**
                * Informar o número do recibo da última CAT referente ao mesmo acidente/doença relacionada ao trabalho, nos casos:
                *
                * <p>a) de CAT de reabertura;</p>
                * <p>b) de óbito, quando houver CAT anterior.</p>
                * <p>Validação: Deve corresponder ao número do recibo do arquivo relativo à última CAT informada anteriormente, pertencente ao mesmo contrato, desde que {indCatObito}(../indCatObito) da última CAT informada seja igual a [N]. O sistema não efetuará a conferência da informação se {dtAcid}(../dtAcid) for anterior a {sucessaoVinc/dtTransf}(2200_vinculo_sucessaoVinc_dtTransf), {transfDom/dtTransf}(2200_vinculo_transfDom_dtTransf) ou {dtAltCPF}(2200_vinculo_mudancaCPF_dtAltCPF) do evento S-2200.</p>
                * <p>OBS.: Quando a data do acidente for anterior à data de obrigatoriedade do empregador ao envio deste evento, a CAT de reabertura e/ou de óbito não devem ser informadas ao eSocial, mantendo-se o procedimento realizado na emissão da CAT original.</p>
                */
               String nrRecCatOrig;

            }

         }

      }

   }

}

