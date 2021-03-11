/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esocial.v1_0;

/**
 *
 * @author Ivo
 */
public class Tipos {

  /** Informações de identificação do evento. */
  public static class T_ideEvento_evtTab {

    /** Identificação do ambiente. */
    private String tpAmb;

    /** Processo de emissão do evento. */
    private String procEmi;

    /**
     * Versão do processo de emissão do evento. Informar a versão do aplicativo emissor do evento.
     */
    private String verProc;
  }

  /**
   * Informações de identificação do evento.
   *
   * <p>CHAVE_GRUPO: {indApuracao}, {perApur}, {indGuia}
   */
  public static class T_ideEvento_folha {

    /** Informe [1] para arquivo original ou [2] para arquivo de retificação. */
    private String indRetif;

    /**
     * Preencher com o número do recibo do arquivo a ser retificado.
     *
     * <p>Validação: O preenchimento é obrigatório se {indRetif}(./indRetif) = [2].
     *
     * <p>Deve ser um recibo de entrega válido, correspondente ao arquivo que está sendo retificado.
     */
    private String nrRecibo;

    /** Indicativo de período de apuração. */
    private String indApuracao;

    /**
     * Informar o mês/ano (formato AAAA-MM) de referência das informações, se
     * {indApuracao}(./indApuracao) for igual a [1], ou apenas o ano (formato AAAA), se
     * {indApuracao}(./indApuracao) for igual a [2].
     *
     * <p>Validação: Deve ser um mês/ano ou ano válido, igual ou posterior ao início da
     * obrigatoriedade dos eventos periódicos para o empregador.
     */
    private String perApur;

    /** Indicativo do tipo de guia. */
    private String indGuia;

    /** Identificação do ambiente. */
    private String tpAmb;

    /** Processo de emissão do evento. */
    private String procEmi;

    /**
     * Versão do processo de emissão do evento. Informar a versão do aplicativo emissor do evento.
     */
    private String verProc;
  }

  /**
   * Informações de identificação do evento.
   *
   * <p>CHAVE_GRUPO: {indApuracao}, {perApur}
   */
  public static class T_ideEvento_folha_opp {

    /** Informe [1] para arquivo original ou [2] para arquivo de retificação. */
    private String indRetif;

    /**
     * Preencher com o número do recibo do arquivo a ser retificado.
     *
     * <p>Validação: O preenchimento é obrigatório se {indRetif}(./indRetif) = [2].
     *
     * <p>Deve ser um recibo de entrega válido, correspondente ao arquivo que está sendo retificado.
     */
    private String nrRecibo;

    /** Indicativo de período de apuração. */
    private String indApuracao;

    /**
     * Informar o mês/ano (formato AAAA-MM) de referência das informações, se
     * {indApuracao}(./indApuracao) for igual a [1], ou apenas o ano (formato AAAA), se
     * {indApuracao}(./indApuracao) for igual a [2].
     *
     * <p>Validação: Deve ser um mês/ano ou ano válido, igual ou posterior ao início da
     * obrigatoriedade dos eventos periódicos para o empregador.
     */
    private String perApur;

    /** Identificação do ambiente. */
    private String tpAmb;

    /** Processo de emissão do evento. */
    private String procEmi;

    /**
     * Versão do processo de emissão do evento. Informar a versão do aplicativo emissor do evento.
     */
    private String verProc;
  }

  /**
   * Informações de identificação do evento.
   *
   * <p>CHAVE_GRUPO: {perApur}, {indGuia}
   */
  public static class T_ideEvento_folha_mensal {

    /** Informe [1] para arquivo original ou [2] para arquivo de retificação. */
    private String indRetif;

    /**
     * Preencher com o número do recibo do arquivo a ser retificado.
     *
     * <p>Validação: O preenchimento é obrigatório se {indRetif}(./indRetif) = [2].
     *
     * <p>Deve ser um recibo de entrega válido, correspondente ao arquivo que está sendo retificado.
     */
    private String nrRecibo;

    /**
     * Informar o mês/ano (formato AAAA-MM) de referência das informações.
     *
     * <p>Validação: Deve ser um mês/ano válido, igual ou posterior ao início da obrigatoriedade dos
     * eventos periódicos para o empregador.
     */
    private String perApur;

    /** Indicativo do tipo de guia. */
    private String indGuia;

    /** Identificação do ambiente. */
    private String tpAmb;

    /** Processo de emissão do evento. */
    private String procEmi;

    /**
     * Versão do processo de emissão do evento. Informar a versão do aplicativo emissor do evento.
     */
    private String verProc;
  }

  /**
   * Informações de identificação do evento.
   *
   * <p>CHAVE_GRUPO: {indApuracao}, {perApur}, {indGuia}
   */
  public static class T_ideEvento_folha_sem_retificacao {

    /** Indicativo de período de apuração. */
    private String indApuracao;

    /**
     * Informar o mês/ano (formato AAAA-MM) de referência das informações, se
     * {indApuracao}(./indApuracao) for igual a [1], ou apenas o ano (formato AAAA), se
     * {indApuracao}(./indApuracao) for igual a [2].
     *
     * <p>Validação: Deve ser um mês/ano ou ano válido, igual ou posterior ao início da
     * obrigatoriedade dos eventos periódicos para o empregador.
     */
    private String perApur;

    /** Indicativo do tipo de guia. */
    private String indGuia;

    /** Identificação do ambiente. */
    private String tpAmb;

    /** Processo de emissão do evento. */
    private String procEmi;

    /**
     * Versão do processo de emissão do evento. Informar a versão do aplicativo emissor do evento.
     */
    private String verProc;
  }

  /** Informações de identificação do evento. */
  public static class T_ideEvento_trab {

    /** Informe [1] para arquivo original ou [2] para arquivo de retificação. */
    private String indRetif;

    /**
     * Preencher com o número do recibo do arquivo a ser retificado.
     *
     * <p>Validação: O preenchimento é obrigatório se {indRetif}(./indRetif) = [2].
     *
     * <p>Deve ser um recibo de entrega válido, correspondente ao arquivo que está sendo retificado.
     */
    private String nrRecibo;

    /** Identificação do ambiente. */
    private String tpAmb;

    /** Processo de emissão do evento. */
    private String procEmi;

    /**
     * Versão do processo de emissão do evento. Informar a versão do aplicativo emissor do evento.
     */
    private String verProc;
  }

  /** Informações de identificação do evento. */
  public static class T_ideEvento_trab_indGuia {

    /** Informe [1] para arquivo original ou [2] para arquivo de retificação. */
    private String indRetif;

    /**
     * Preencher com o número do recibo do arquivo a ser retificado.
     *
     * <p>Validação: O preenchimento é obrigatório se {indRetif}(./indRetif) = [2].
     *
     * <p>Deve ser um recibo de entrega válido, correspondente ao arquivo que está sendo retificado.
     */
    private String nrRecibo;

    /** Indicativo do tipo de guia. */
    private String indGuia;

    /** Identificação do ambiente. */
    private String tpAmb;

    /** Processo de emissão do evento. */
    private String procEmi;

    /**
     * Versão do processo de emissão do evento. Informar a versão do aplicativo emissor do evento.
     */
    private String verProc;
  }

  /** Identificação do evento de retorno. */
  public static class T_ideEvento_retorno_trab {

    /**
     * Preencher com o número do recibo do arquivo que deu origem ao presente arquivo de retorno ao
     * empregador.
     *
     * <p>Validação: Deve ser um recibo de entrega válido, correspondente ao arquivo que deu origem
     * ao presente arquivo de retorno (S-1200, S-2299, S-2399 ou S-3000).
     */
    private String nrRecArqBase;

    /** Indicativo de período de apuração. */
    private String indApuracao;

    /**
     * Informar o mês/ano (formato AAAA-MM) de referência das informações, se
     * {indApuracao}(./indApuracao) for igual a [1], ou apenas o ano (formato AAAA), se
     * {indApuracao}(./indApuracao) for igual a [2].
     */
    private String perApur;
  }

  /**
   * Identificação do evento de retorno.
   *
   * <p>DESCRICAO_COMPLETA:Identificação do evento de retorno.
   *
   * <p>Evento de origem: S-1299.
   */
  public static class T_ideEvento_retorno_contrib {

    /** Indicativo de período de apuração. */
    private String indApuracao;

    /**
     * Informar o mês/ano (formato AAAA-MM) de referência das informações, se
     * {indApuracao}(./indApuracao) for igual a [1], ou apenas o ano (formato AAAA), se
     * {indApuracao}(./indApuracao) for igual a [2].
     */
    private String perApur;
  }

  /**
   * Informações de identificação do empregador.
   *
   * <p>CHAVE_GRUPO: {tpInsc}, {nrInsc}
   */
  public static class T_ideEmpregador {

    /** Preencher com o código correspondente ao tipo de inscrição, conforme Tabela 05. */
    private String tpInsc;

    /**
     * Informar o número de inscrição do contribuinte de acordo com o tipo de inscrição indicado no
     * campo {ideEmpregador/tpInsc}(./tpInsc) e conforme informado em S-1000.
     */
    private String nrInsc;
  }

  /**
   * Informações de identificação do empregador.
   *
   * <p>CHAVE_GRUPO: {tpInsc}, {nrInsc}
   */
  public static class T_ideEmpregador_cnpj {

    /** Preencher com o código correspondente ao tipo de inscrição, conforme Tabela 05. */
    private String tpInsc;

    /**
     * Informar o número de inscrição do contribuinte de acordo com o tipo de inscrição indicado no
     * campo {ideEmpregador/tpInsc}(./tpInsc) e conforme informado em S-1000.
     */
    private String nrInsc;
  }

  /**
   * Novo período de validade das informações.
   *
   * <p>DESCRICAO_COMPLETA:Informação preenchida exclusivamente em caso de alteração do período de
   * validade das informações, apresentando o novo período de validade.
   *
   * <p>CONDICAO_GRUPO: OC
   */
  public static class T_novaValidade {

    /**
     * Preencher com o mês e ano de início da validade das informações prestadas no evento, no
     * formato AAAA-MM.
     *
     * <p>Validação: Deve ser uma data válida, igual ou posterior à data de início de
     * obrigatoriedade deste evento para o empregador no eSocial, no formato AAAA-MM.
     */
    private String iniValid;

    /**
     * Preencher com o mês e ano de término da validade das informações, se houver.
     *
     * <p>Validação: Se informado, deve estar no formato AAAA-MM e ser um período igual ou posterior
     * a {iniValid}(./iniValid).
     */
    private String fimValid;
  }

  /**
   * Informações sobre a existência de processos judiciais do trabalhador
   *
   * <p>DESCRICAO_COMPLETA:Informações sobre a existência de processos judiciais do trabalhador com
   * decisão favorável quanto à não incidência de contribuições sociais e/ou Imposto de Renda.
   *
   * <p>CHAVE_GRUPO: {tpTrib}, {nrProcJud}, {codSusp}
   *
   * <p>CONDICAO_GRUPO: OC
   */
  public static class T_procJudTrab {

    /** Abrangência da decisão. */
    private String tpTrib;

    /**
     * Informar um número de processo judicial cadastrado através do evento S-1070, cujo
     * {indMatProc}(1070_infoProcesso_inclusao_dadosProc_indMatProc) seja igual a [1].
     *
     * <p>Validação: Deve ser um número de processo judicial válido e existente na Tabela de
     * Processos (S-1070), com {indMatProc}(1070_infoProcesso_inclusao_dadosProc_indMatProc) = [1].
     */
    private String nrProcJud;

    /**
     * Código do indicativo da suspensão, atribuído pelo empregador em S-1070.
     *
     * <p>Validação: A informação prestada deve estar de acordo com o que foi informado em S-1070.
     */
    private Integer codSusp;
  }

  public static class T_infoInterm {

    /**
     * Dia do mês efetivamente trabalhado pelo empregado com contrato de trabalho intermitente.
     *
     * <p>Validação: Deve ser um número entre 1 e 31, de acordo com o calendário anual.
     */
    private String dia;
  }

  /**
   * Itens da remuneração do trabalhador
   *
   * <p>DESCRICAO_COMPLETA:Rubricas que compõem a remuneração do trabalhador.
   */
  public static class T_itensRemun_rpps {

    /**
     * Informar o código atribuído pelo empregador que identifica a rubrica em sua folha de
     * pagamento.
     */
    private String codRubr;

    /**
     * Preencher com o identificador da Tabela de Rubricas para a rubrica definida em
     * {codRubr}(./codRubr).
     */
    private String ideTabRubr;

    /**
     * Informar a quantidade de referência para apuração (em horas, cotas, meses, etc.).
     *
     * <p>Preenchimento obrigatório quando se tratar de rubrica relativa a faltas ou Descanso
     * Semanal Remunerado - DSR sobre faltas (nesse caso, informar a quantidade de dias).
     *
     * <p>Validação: Deve ser maior que 0 (zero). Informação obrigatória se {codRubr}(./codRubr)
     * tiver {natRubr}(1010_infoRubrica_inclusao_dadosRubrica_natRubr) em S-1010 igual a [9207,
     * 9211].
     */
    private Double qtdRubr;

    /**
     * Informar o fator, percentual, etc. da rubrica, quando necessário.
     *
     * <p>Validação: Deve ser maior que 0 (zero).
     */
    private Double fatorRubr;

    /**
     * Valor total da rubrica.
     *
     * <p>Validação: Deve ser maior que 0 (zero).
     */
    private Double vrRubr;

    /** Indicativo de tipo de apuração de IR. */
    private String indApurIR;
  }

  /** Grupo de informações do nascimento do trabalhador. */
  public static class T_nascimento {

    /** Preencher com a data de nascimento. */
    private javax.xml.datatype.XMLGregorianCalendar dtNascto;

    /**
     * Preencher com o código do país de nascimento do trabalhador.
     *
     * <p>Validação: Deve ser um código válido e existente na Tabela 06.
     */
    private String paisNascto;

    /**
     * Preencher com o código do país de nacionalidade do trabalhador.
     *
     * <p>Validação: Deve ser um código válido e existente na Tabela 06.
     */
    private String paisNac;
  }

  /**
   * Endereço no Brasil.
   *
   * <p>CONDICAO_GRUPO: O (se não informado o grupo {exterior}(../exterior)); N (nos demais casos)
   */
  public static class T_endereco_brasil {

    /**
     * Tipo de logradouro.
     *
     * <p>Validação: Se informado, deve ser um código válido e existente na Tabela 20.
     */
    private String tpLograd;

    /** Descrição do logradouro. */
    private String dscLograd;

    /**
     * Número do logradouro.
     *
     * <p>Se não houver número a ser informado, preencher com "S/N".
     */
    private String nrLograd;

    /** Complemento do logradouro. */
    private String complemento;

    /** Nome do bairro/distrito. */
    private String bairro;

    /**
     * Código de Endereçamento Postal - CEP.
     *
     * <p>Validação: Deve ser preenchido apenas com números, com 8 (oito) posições.
     */
    private String cep;

    /**
     * Preencher com o código do município, conforme tabela do IBGE.
     *
     * <p>Validação: Deve ser um código válido e existente na tabela do IBGE.
     */
    private Integer codMunic;

    /** Preencher com a sigla da Unidade da Federação - UF. */
    private String uf;
  }

  /**
   * Endereço no exterior.
   *
   * <p>CONDICAO_GRUPO: O (se não informado o grupo {brasil}(../brasil)); N (nos demais casos)
   */
  public static class T_endereco_exterior {

    /**
     * Preencher com o código do país.
     *
     * <p>Validação: Deve ser um código válido e existente na Tabela 06.
     */
    private String paisResid;

    /** Descrição do logradouro. */
    private String dscLograd;

    /**
     * Número do logradouro.
     *
     * <p>Se não houver número a ser informado, preencher com "S/N".
     */
    private String nrLograd;

    /** Complemento do logradouro. */
    private String complemento;

    /** Nome do bairro/distrito. */
    private String bairro;

    /** Nome da cidade. */
    private String nmCid;

    /** Código de Endereçamento Postal. */
    private String codPostal;
  }

  public static class T_contato {

    /**
     * Número de telefone do trabalhador, com DDD.
     *
     * <p>Validação: Se preenchido, deve conter apenas números, com o mínimo de dez dígitos.
     */
    private String fonePrinc;

    /**
     * Endereço eletrônico.
     *
     * <p>Validação: O e-mail deve ser possuir o caractere "@" e este não pode estar no início e no
     * fim do e-mail. Deve possuir no mínimo um caractere "." depois do @ e não pode estar no início
     * ou no final do e-mail.
     */
    private String emailPrinc;
  }

  public static class T_aprend {

    /** Preencher com o código correspondente ao tipo de inscrição, conforme Tabela 05. */
    private String tpInsc;

    /**
     * Informar o número de inscrição do estabelecimento para o qual a contratação de aprendiz foi
     * efetivada, de acordo com o tipo de inscrição indicado no campo {aprend/tpInsc}(./tpInsc).
     *
     * <p>Validação: Deve ser um identificador válido e:
     *
     * <p>a) Se {aprend/tpInsc}(./tpInsc) = [1], deve ser informado com 14 (catorze) algarismos. Se
     * o empregador for pessoa jurídica, a raiz do CNPJ informado deve ser diferente de
     * {ideEmpregador/nrInsc}(/ideEmpregador_nrInsc).
     *
     * <p>b) Se {aprend/tpInsc}(./tpInsc) = [2], deve ser diferente do CPF do empregado. Se o
     * empregador for pessoa física, também deve ser diferente do CPF do empregador.
     */
    private String nrInsc;
  }

  public static class T_remuneracao {

    /**
     * Salário base do trabalhador, correspondente à parte fixa da remuneração.
     *
     * <p>Validação: Se {undSalFixo}(./undSalFixo) for igual a [7], preencher com 0 (zero).
     */
    private Double vrSalFx;

    /** Unidade de pagamento da parte fixa da remuneração. */
    private String undSalFixo;

    /**
     * Descrição do salário por tarefa ou variável e como este é calculado. Ex.: Comissões pagas no
     * percentual de 10% sobre as vendas.
     *
     * <p>Validação: Preenchimento obrigatório se {undSalFixo}(./undSalFixo) for igual a [6, 7].
     */
    private String dscSalVar;
  }

  public static class T_localTrabGeral {

    /** Preencher com o código correspondente ao tipo de inscrição, conforme Tabela 05. */
    private String tpInsc;

    /**
     * Informar o número de inscrição do contribuinte de acordo com o tipo de inscrição indicado no
     * campo {localTrabGeral/tpInsc}(./tpInsc).
     *
     * <p>Validação: Deve ser um número de inscrição válido e existente na Tabela de
     * Estabelecimentos (S-1005), bem como compatível com {localTrabGeral/tpInsc}(./tpInsc).
     */
    private String nrInsc;

    /** Descrição complementar do local de trabalho. */
    private String descComp;
  }

  public static class T_horContratual {

    /**
     * Quantidade média de horas relativas à jornada semanal do trabalhador.
     *
     * <p>Validação: Deve ser preenchida se {codCateg}(../codCateg) for diferente de [111]. Se
     * informada, deve ser maior que 0 (zero).
     */
    private Double qtdHrsSem;

    /** Tipo de jornada. */
    private String tpJornada;

    /**
     * Preencher com o código relativo ao tipo de contrato em tempo parcial.
     *
     * <p>Validação: O código [1] só é válido se {codCateg}(../codCateg) = [104]. Os códigos [2, 3]
     * não são válidos se {codCateg}(../codCateg) = [104].
     */
    private String tmpParc;

    /** Indicar se a jornada semanal possui horário noturno (no todo ou em parte). */
    private String horNoturno;

    /**
     * Descrição da jornada semanal contratual, contendo os dias da semana e os respectivos horários
     * contratuais (entrada, saída e intervalos).
     */
    private String dscJorn;
  }

  public static class T_alvaraJudicial {

    /**
     * Preencher com o número do processo judicial.
     *
     * <p>Validação: Deve ser um número de processo judicial válido.
     */
    private String nrProcJud;
  }

  public static class T_treiCap {

    /**
     * Informar o código do treinamento, capacitação, exercício simulado ou outra anotação, conforme
     * Tabela 28.
     *
     * <p>Validação: Deve ser um código válido e existente na Tabela 28.
     */
    private Integer codTreiCap;
  }

  /**
   * Informações de identificação do trabalhador e do vínculo.
   *
   * <p>CHAVE_GRUPO: {cpfTrab}, {matricula}
   */
  public static class T_ideVinculo {

    /** Preencher com o número do CPF do trabalhador. */
    private String cpfTrab;

    /**
     * Matrícula atribuída ao trabalhador pela empresa ou, no caso de servidor público, a matrícula
     * constante no Sistema de Administração de Recursos Humanos do órgão.
     *
     * <p>Validação: Deve corresponder à matrícula informada pelo empregador no evento S-2200 do
     * respectivo vínculo trabalhista.
     */
    private String matricula;
  }

  /**
   * Informações de identificação do trabalhador e do vínculo.
   *
   * <p>CHAVE_GRUPO: {cpfTrab}, {matricula}, {codCateg}
   */
  public static class T_ideVinculo_sst {

    /** Preencher com o número do CPF do trabalhador. */
    private String cpfTrab;

    /**
     * Matrícula atribuída ao trabalhador pela empresa ou, no caso de servidor público, a matrícula
     * constante no Sistema de Administração de Recursos Humanos do órgão.
     *
     * <p>Validação: Deve corresponder à matrícula informada pelo empregador no evento S-2190,
     * S-2200 ou S-2300 do respectivo contrato. Não preencher no caso de Trabalhador Sem Vínculo de
     * Emprego/Estatutário - TSVE sem informação de matrícula no evento S-2300.
     */
    private String matricula;

    /**
     * Preencher com o código da categoria do trabalhador.
     *
     * <p>Informar somente no caso de TSVE sem informação de matrícula no evento S-2300.
     *
     * <p>Validação: Informação obrigatória e exclusiva se não houver preenchimento de
     * {matricula}(./matricula). Se informado, deve ser um código válido e existente na Tabela 01.
     */
    private Integer codCateg;
  }

  /**
   * Identificação do TSVE
   *
   * <p>DESCRICAO_COMPLETA:Identificação do Trabalhador Sem Vínculo de Emprego/Estatutário - TSVE.
   *
   * <p>CHAVE_GRUPO: {cpfTrab}, {matricula}, {codCateg}
   */
  public static class T_ideTrabSemVinculo {

    /** Preencher com o número do CPF do trabalhador. */
    private String cpfTrab;

    /**
     * Matrícula atribuída ao trabalhador pela empresa.
     *
     * <p>Validação: Deve corresponder à matrícula informada pelo empregador no evento S-2300 do
     * respectivo contrato. Não preencher no caso de TSVE sem informação de matrícula no evento
     * S-2300.
     */
    private String matricula;

    /**
     * Preencher com o código da categoria do trabalhador.
     *
     * <p>Informar somente no caso de TSVE sem informação de matrícula no evento S-2300.
     *
     * <p>Validação: Informação obrigatória e exclusiva se não houver preenchimento de
     * {matricula}(./matricula). Se informado, deve ser um código válido e existente na Tabela 01.
     */
    private Integer codCateg;
  }

  /**
   * Informação relativa a empresas do Simples
   *
   * <p>DESCRICAO_COMPLETA:Informação relativa a empresas enquadradas no regime de tributação
   * Simples Nacional.
   *
   * <p>CONDICAO_GRUPO: O (se {classTrib}(1000_infoEmpregador_inclusao_infoCadastro_classTrib) em
   * S-1000 = [03]); N (nos demais casos)
   */
  public static class T_infoSimples {

    /** Indicador de contribuição substituída. */
    private String indSimples;
  }

  /**
   * Informação de múltiplos vínculos
   *
   * <p>DESCRICAO_COMPLETA:Grupo preenchido exclusivamente em caso de trabalhador que possua outros
   * vínculos/atividades nos quais já tenha ocorrido desconto de contribuição previdenciária.
   *
   * <p>CONDICAO_GRUPO: OC
   */
  public static class T_infoMV {

    /** Indicador de desconto da contribuição previdenciária do trabalhador. */
    private String indMV;

    /**
     * Remuneração recebida pelo trabalhador em outras empresas ou atividades
     *
     * <p>DESCRICAO_COMPLETA:Informações relativas ao trabalhador que possui vínculo empregatício
     * com outra(s) empresa(s) e/ou que exerce outras atividades como contribuinte individual,
     * detalhando as empresas que efetuaram (ou efetuarão) desconto da contribuição.
     *
     * <p>CHAVE_GRUPO: {tpInsc}, {nrInsc}, {codCateg}
     */
    private RemunOutrEmpr remunOutrEmpr;

    public static class RemunOutrEmpr {

      /** Preencher com o código correspondente ao tipo de inscrição, conforme Tabela 05. */
      private String tpInsc;

      /**
       * Informar o número de inscrição do contribuinte de acordo com o tipo de inscrição indicado
       * no campo {remunOutrEmpr/tpInsc}(./tpInsc).
       *
       * <p>Validação: a) Se {remunOutrEmpr/tpInsc}(./tpInsc) = [1], deve ser um CNPJ válido,
       * diferente do CNPJ base indicado no evento de Informações do Empregador (S-1000) e dos
       * estabelecimentos informados através do evento S-1005.
       *
       * <p>b) Se {remunOutrEmpr/tpInsc}(./tpInsc) = [2], deve ser um CPF válido e diferente do CPF
       * do trabalhador e ainda, caso o empregador seja pessoa física, diferente do CPF do
       * empregador.
       */
      private String nrInsc;

      /**
       * Preencher com o código da categoria do trabalhador na qual houve a remuneração.
       *
       * <p>Validação: Deve ser um código válido e existente na Tabela 01.
       */
      private Integer codCateg;

      /**
       * Preencher com o valor da remuneração recebida pelo trabalhador na outra empresa/atividade,
       * sobre a qual houve desconto/recolhimento da contribuição do segurado.
       *
       * <p>Validação: Deve ser maior que 0 (zero).
       */
      private Double vlrRemunOE;
    }
  }

  public static class T_infoEstagiario {

    /** Natureza do estágio. */
    private String natEstagio;

    /** Informar o nível do estágio. */
    private String nivEstagio;

    /** Área de atuação do estagiário. */
    private String areaAtuacao;

    /** Número da apólice de seguro. */
    private String nrApol;

    /**
     * Data prevista para o término do estágio.
     *
     * <p>Validação: Deve ser uma data posterior à data de início do estágio.
     */
    private javax.xml.datatype.XMLGregorianCalendar dtPrevTerm;

    /** Instituição de ensino. */
    private InstEnsino instEnsino;

    /**
     * Agente de integração.
     *
     * <p>CONDICAO_GRUPO: OC
     */
    private AgeIntegracao ageIntegracao;

    /**
     * Supervisor do estágio.
     *
     * <p>CONDICAO_GRUPO: OC
     */
    private SupervisorEstagio supervisorEstagio;

    public static class InstEnsino {

      /**
       * Preencher com o CNPJ da instituição de ensino. Deve ser preenchido apenas se a instituição
       * de ensino for brasileira.
       *
       * <p>Validação: Se informado, deve ser um CNPJ válido, com 14 (catorze) algarismos.
       */
      private String cnpjInstEnsino;

      /**
       * Informar a razão social.
       *
       * <p>Validação: Preenchimento obrigatório e exclusivo se o campo
       * {cnpjInstEnsino}(./cnpjInstEnsino) não estiver preenchido.
       */
      private String nmRazao;

      /**
       * Descrição do logradouro.
       *
       * <p>Validação: Preenchimento obrigatório e exclusivo se o campo
       * {cnpjInstEnsino}(./cnpjInstEnsino) não estiver preenchido.
       */
      private String dscLograd;

      /**
       * Número do logradouro.
       *
       * <p>Se não houver número a ser informado, preencher com "S/N".
       *
       * <p>Validação: Preenchimento obrigatório e exclusivo se o campo
       * {cnpjInstEnsino}(./cnpjInstEnsino) não estiver preenchido.
       */
      private String nrLograd;

      /**
       * Nome do bairro/distrito.
       *
       * <p>Validação: Preenchimento obrigatório e exclusivo se o campo
       * {cnpjInstEnsino}(./cnpjInstEnsino) não estiver preenchido.
       */
      private String bairro;

      /**
       * Código de Endereçamento Postal - CEP.
       *
       * <p>Validação: Não informar se o campo {cnpjInstEnsino}(./cnpjInstEnsino) estiver
       * preenchido. Se informado, deve ser preenchido apenas com números, com 8 (oito) posições.
       */
      private String cep;

      /**
       * Preencher com o código do município, conforme tabela do IBGE.
       *
       * <p>Validação: Não informar se o campo {cnpjInstEnsino}(./cnpjInstEnsino) estiver
       * preenchido. Se informado, deve ser um código válido e existente na tabela do IBGE.
       */
      private Integer codMunic;

      /**
       * Preencher com a sigla da Unidade da Federação - UF.
       *
       * <p>Validação: Não informar se o campo {cnpjInstEnsino}(./cnpjInstEnsino) estiver
       * preenchido.
       */
      private String uf;
    }

    public static class AgeIntegracao {

      /**
       * CNPJ do agente de integração.
       *
       * <p>Validação: Deve ser um CNPJ válido, com 14 (catorze) algarismos.
       */
      private String cnpjAgntInteg;
    }

    public static class SupervisorEstagio {

      /**
       * CPF do responsável pela supervisão do estagiário.
       *
       * <p>Validação: Deve ser um CPF válido.
       */
      private String cpfSupervisor;
    }
  }

  /**
   * Identificação do beneficiário e do benefício.
   *
   * <p>CHAVE_GRUPO: {cpfBenef}, {nrBeneficio}
   */
  public static class T_ideBeneficio {

    /** Informar o CPF do beneficiário. */
    private String cpfBenef;

    /** Número do benefício. */
    private String nrBeneficio;
  }

  public static class T_sucessaoVinc {

    /** Preencher com o código correspondente ao tipo de inscrição, conforme Tabela 05. */
    private String tpInsc;

    /**
     * Informar o número de inscrição do empregador anterior, de acordo com o tipo de inscrição
     * indicado no campo {sucessaoVinc/tpInsc}(./tpInsc).
     */
    private String nrInsc;

    /** Matrícula do trabalhador no empregador anterior. */
    private String matricAnt;

    /**
     * Preencher com a data de admissão do trabalhador. No caso de transferência do empregado, deve
     * ser preenchida a data inicial do vínculo no primeiro empregador (data de início do vínculo).
     */
    private javax.xml.datatype.XMLGregorianCalendar dtAdm;
  }
}
