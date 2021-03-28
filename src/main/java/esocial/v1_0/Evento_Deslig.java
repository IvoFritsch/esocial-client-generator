package esocial.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlTransient;

/** S-2299 - Desligamento */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "",
    propOrder = {
      "evtDeslig",
    })
@XmlRootElement(name = "eSocial")
public class Evento_Deslig {

  /** Evento Desligamento. */
  private EvtDeslig evtDeslig;

  /**
   * Evento Desligamento.
   *
   * @return Conteúdo do campo evtDeslig
   */
  public EvtDeslig getEvtDeslig() {
    return this.evtDeslig;
  }

  /**
   * Evento Desligamento.
   *
   * <p>CHAVE_GRUPO: {Id}
   *
   * <p>REGRA:REGRA_DESLIG_EXCLUI_DESLIGAMENTO_REINTEG
   *
   * <p>REGRA:REGRA_DESLIG_EXCLUSAO_EVENTO
   *
   * <p>REGRA:REGRA_DESLIG_EXISTE_EVENTO_POSTERIOR
   *
   * <p>REGRA:REGRA_DESLIG_TRABALHADOR_AFASTADO
   *
   * <p>REGRA:REGRA_EMPREGADO_DOMESTICO
   *
   * <p>REGRA:REGRA_ENVIO_PROC_FECHAMENTO
   *
   * <p>REGRA:REGRA_EVENTOS_EXTEMP
   *
   * <p>REGRA:REGRA_EVENTO_IMPACTO_FOPAG
   *
   * <p>REGRA:REGRA_EVE_FOPAG_SIMPLIFICADO
   *
   * <p>REGRA:REGRA_EXISTE_INFO_EMPREGADOR
   *
   * <p>REGRA:REGRA_EXTEMP_DOMESTICO
   *
   * <p>REGRA:REGRA_EXTEMP_REINTEGRACAO
   *
   * <p>REGRA:REGRA_GERAL_VALIDA_DADOS_TABCONTRIB
   *
   * <p>REGRA:REGRA_MESMO_PROCEMI
   *
   * <p>REGRA:REGRA_MUDANCA_CPF
   *
   * <p>REGRA:REGRA_REMUN_IND_RETIFICACAO
   *
   * <p>REGRA:REGRA_REMUN_PERMITE_EXCLUSAO
   *
   * <p>REGRA:REGRA_RETIFICA_MESMO_VINCULO
   *
   * <p>REGRA:REGRA_RUBRICA_COMPATIVEL_CATEGORIA
   *
   * <p>REGRA:REGRA_VALIDA_EMPREGADOR
   *
   * <p>REGRA:REGRA_VALIDA_PERIODO_APURACAO
   *
   * <p>REGRA:REGRA_VINCULO_ATIVO_NA_DTEVENTO
   *
   * @return O objeto EvtDeslig para população dos campos filhos
   */
  public EvtDeslig<Evento_Deslig> setEvtDeslig() {
    if (this.evtDeslig == null) {
      this.evtDeslig = new EvtDeslig(this);
    }
    return this.evtDeslig;
  }

  /**
   * Evento Desligamento.
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "ideEvento",
        "ideEmpregador",
        "ideVinculo",
        "infoDeslig",
      })
  public static class EvtDeslig<T> {

    /** Informações de identificação do evento. */
    private Tipos.T_ideEvento_trab_indGuia ideEvento;

    /** Informações de identificação do empregador. */
    private Tipos.T_ideEmpregador ideEmpregador;

    /** Informações de identificação do trabalhador e do vínculo. */
    private Tipos.T_ideVinculo ideVinculo;

    /** Informações relativas ao desligamento do vínculo. */
    private InfoDeslig infoDeslig;

    /**
     * Informações de identificação do evento.
     *
     * @return Conteúdo do campo ideEvento
     */
    public Tipos.T_ideEvento_trab_indGuia getIdeEvento() {
      return this.ideEvento;
    }

    /**
     * Informações de identificação do evento.
     *
     * @return O objeto Tipos.T_ideEvento_trab_indGuia para população dos campos filhos
     */
    public Tipos.T_ideEvento_trab_indGuia<EvtDeslig<T>> setIdeEvento() {
      if (this.ideEvento == null) {
        this.ideEvento = new Tipos.T_ideEvento_trab_indGuia(this);
      }
      return this.ideEvento;
    }

    /**
     * Informações de identificação do empregador.
     *
     * @return Conteúdo do campo ideEmpregador
     */
    public Tipos.T_ideEmpregador getIdeEmpregador() {
      return this.ideEmpregador;
    }

    /**
     * Informações de identificação do empregador.
     *
     * <p>CHAVE_GRUPO: {tpInsc}, {nrInsc}
     *
     * @return O objeto Tipos.T_ideEmpregador para população dos campos filhos
     */
    public Tipos.T_ideEmpregador<EvtDeslig<T>> setIdeEmpregador() {
      if (this.ideEmpregador == null) {
        this.ideEmpregador = new Tipos.T_ideEmpregador(this);
      }
      return this.ideEmpregador;
    }

    /**
     * Informações de identificação do trabalhador e do vínculo.
     *
     * @return Conteúdo do campo ideVinculo
     */
    public Tipos.T_ideVinculo getIdeVinculo() {
      return this.ideVinculo;
    }

    /**
     * Informações de identificação do trabalhador e do vínculo.
     *
     * <p>CHAVE_GRUPO: {cpfTrab}, {matricula}
     *
     * @return O objeto Tipos.T_ideVinculo para população dos campos filhos
     */
    public Tipos.T_ideVinculo<EvtDeslig<T>> setIdeVinculo() {
      if (this.ideVinculo == null) {
        this.ideVinculo = new Tipos.T_ideVinculo(this);
      }
      return this.ideVinculo;
    }

    /**
     * Informações relativas ao desligamento do vínculo.
     *
     * @return Conteúdo do campo infoDeslig
     */
    public InfoDeslig getInfoDeslig() {
      return this.infoDeslig;
    }

    /**
     * Informações relativas ao desligamento do vínculo.
     *
     * @return O objeto InfoDeslig para população dos campos filhos
     */
    public InfoDeslig<EvtDeslig<T>> setInfoDeslig() {
      if (this.infoDeslig == null) {
        this.infoDeslig = new InfoDeslig(this);
      }
      return this.infoDeslig;
    }

    public EvtDeslig(Object pai) {
      this.pai = pai;
    }

    @XmlTransient private final Object pai;

    /**
     * Finaliza a população dos campos filhos desse nível
     *
     * @return O nível anterior da árvore
     */
    public T finish() {
      return (T) pai;
    }
    /**
     * Informações relativas ao desligamento do vínculo.
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "mtvDeslig",
          "dtDeslig",
          "dtAvPrv",
          "indPagtoAPI",
          "dtProjFimAPI",
          "pensAlim",
          "percAliment",
          "vrAlim",
          "nrProcTrab",
          "infoInterm",
          "observacoes",
          "sucessaoVinc",
          "transfTit",
          "mudancaCPF",
          "verbasResc",
          "quarentena",
          "consigFGTS",
        })
    public static class InfoDeslig<T> {

      /** Código de motivo do desligamento. */
      private String mtvDeslig;

      /** Preencher com a data de desligamento do vínculo (último dia trabalhado). */
      private javax.xml.datatype.XMLGregorianCalendar dtDeslig;

      /** Data de concessão do aviso prévio. */
      private javax.xml.datatype.XMLGregorianCalendar dtAvPrv;

      /** Indicativo de pagamento de aviso prévio indenizado pelo empregador, ao empregado. */
      private String indPagtoAPI;

      /** Data projetada para o término do aviso prévio indenizado. */
      private javax.xml.datatype.XMLGregorianCalendar dtProjFimAPI;

      /** Indicativo de pensão alimentícia para fins de retenção de FGTS. */
      private String pensAlim;

      /** Percentual a ser destinado a pensão alimentícia. */
      private Double percAliment;

      /** Valor da pensão alimentícia. */
      private Double vrAlim;

      /**
       * Número que identifica o processo trabalhista, quando o desligamento se der por decisão
       * judicial.
       */
      private String nrProcTrab;

      /**
       * Informações relativas ao trabalho intermitente.
       *
       * <p>- Esse campo pode ser repetido até 31 vezes
       */
      private java.util.List<Tipos.T_infoInterm> infoInterm;

      /**
       * Observações sobre o desligamento.
       *
       * <p>- Esse campo pode ser repetido até 99 vezes
       */
      private java.util.List<Observacoes> observacoes;

      /** Sucessão do vínculo trabalhista/estatutário */
      private SucessaoVinc sucessaoVinc;

      /** Transferência de titularidade do empregado doméstico */
      private TransfTit transfTit;

      /** Informação do novo CPF do trabalhador. */
      private MudancaCPF mudancaCPF;

      /** Verbas rescisórias */
      private VerbasResc verbasResc;

      /**
       * Informações sobre a quarentena remunerada ou outra situação de desligamento com data
       * anterior
       */
      private Quarentena quarentena;

      /**
       * Informações sobre operação de crédito consignado com garantia de FGTS.
       *
       * <p>- Esse campo pode ser repetido até 99 vezes
       */
      private java.util.List<ConsigFGTS> consigFGTS;

      /**
       * Código de motivo do desligamento.
       *
       * @return Conteúdo do campo mtvDeslig
       */
      public String getMtvDeslig() {
        return this.mtvDeslig;
      }

      /**
       * Código de motivo do desligamento.
       *
       * <p>Validação: Deve ser um código válido e existente na Tabela 19, bem como compatível com o
       * código de categoria do trabalhador, conforme Tabela 19.
       *
       * @param mtvDeslig Valor para atribuir ao campo mtvDeslig
       * @return O próprio InfoDeslig para continuar populando outros campos
       */
      public InfoDeslig<T> setMtvDeslig(String mtvDeslig) {
        this.mtvDeslig = mtvDeslig;
        return this;
      }

      /**
       * Preencher com a data de desligamento do vínculo (último dia trabalhado).
       *
       * @return Conteúdo do campo dtDeslig
       */
      public javax.xml.datatype.XMLGregorianCalendar getDtDeslig() {
        return this.dtDeslig;
      }

      /**
       * Preencher com a data de desligamento do vínculo (último dia trabalhado).
       *
       * <p>Validação: Deve ser uma data igual ou anterior à data atual acrescida de 10 (dez) dias.
       * No caso de empregado reintegrado, também deve ser uma data igual ou posterior a
       * {dtEfetRetorno}(2298_infoReintegr_dtEfetRetorno) do evento S-2298.
       *
       * @param dtDeslig Valor para atribuir ao campo dtDeslig
       * @return O próprio InfoDeslig para continuar populando outros campos
       */
      public InfoDeslig<T> setDtDeslig(javax.xml.datatype.XMLGregorianCalendar dtDeslig) {
        this.dtDeslig = dtDeslig;
        return this;
      }

      /**
       * Data de concessão do aviso prévio.
       *
       * @return Conteúdo do campo dtAvPrv
       */
      public javax.xml.datatype.XMLGregorianCalendar getDtAvPrv() {
        return this.dtAvPrv;
      }

      /**
       * Data de concessão do aviso prévio.
       *
       * <p>Validação: Se informada, deve ser igual ou posterior à data de admissão e igual ou
       * anterior a {dtDeslig}(./dtDeslig).
       *
       * @param dtAvPrv Valor para atribuir ao campo dtAvPrv
       * @return O próprio InfoDeslig para continuar populando outros campos
       */
      public InfoDeslig<T> setDtAvPrv(javax.xml.datatype.XMLGregorianCalendar dtAvPrv) {
        this.dtAvPrv = dtAvPrv;
        return this;
      }

      /**
       * Indicativo de pagamento de aviso prévio indenizado pelo empregador, ao empregado.
       *
       * @return Conteúdo do campo indPagtoAPI
       */
      public String getIndPagtoAPI() {
        return this.indPagtoAPI;
      }

      /**
       * Indicativo de pagamento de aviso prévio indenizado pelo empregador, ao empregado.
       *
       * @param indPagtoAPI Valor para atribuir ao campo indPagtoAPI
       * @return O próprio InfoDeslig para continuar populando outros campos
       */
      public InfoDeslig<T> setIndPagtoAPI(String indPagtoAPI) {
        if (!"S".equals(indPagtoAPI) && !"N".equals(indPagtoAPI))
          throw new RuntimeException(
              "Valor " + String.valueOf(indPagtoAPI) + " inválido para o campo indPagtoAPI");
        this.indPagtoAPI = indPagtoAPI;
        return this;
      }
      /**
       * Sim
       *
       * @return O próprio InfoDeslig para continuar populando outros campos
       */
      public InfoDeslig<T> setIndPagtoAPI_S() {
        this.indPagtoAPI = "S";
        return this;
      }
      /**
       * Não
       *
       * @return O próprio InfoDeslig para continuar populando outros campos
       */
      public InfoDeslig<T> setIndPagtoAPI_N() {
        this.indPagtoAPI = "N";
        return this;
      }

      /**
       * Data projetada para o término do aviso prévio indenizado.
       *
       * @return Conteúdo do campo dtProjFimAPI
       */
      public javax.xml.datatype.XMLGregorianCalendar getDtProjFimAPI() {
        return this.dtProjFimAPI;
      }

      /**
       * Data projetada para o término do aviso prévio indenizado.
       *
       * <p>Validação: Obrigatório se {indPagtoAPI}(./indPagtoAPI) for igual a [S], devendo ser
       * igual ou posterior a {dtDeslig}(./dtDeslig).
       *
       * @param dtProjFimAPI Valor para atribuir ao campo dtProjFimAPI
       * @return O próprio InfoDeslig para continuar populando outros campos
       */
      public InfoDeslig<T> setDtProjFimAPI(javax.xml.datatype.XMLGregorianCalendar dtProjFimAPI) {
        this.dtProjFimAPI = dtProjFimAPI;
        return this;
      }

      /**
       * Indicativo de pensão alimentícia para fins de retenção de FGTS.
       *
       * @return Conteúdo do campo pensAlim
       */
      public String getPensAlim() {
        return this.pensAlim;
      }

      /**
       * Indicativo de pensão alimentícia para fins de retenção de FGTS.
       *
       * <p>Validação: Preenchimento obrigatório e exclusivo se o vínculo for celetista
       * ({tpRegTrab}(2200_vinculo_tpRegTrab) em S-2200 = [1]).
       *
       * @param pensAlim Valor para atribuir ao campo pensAlim
       * @return O próprio InfoDeslig para continuar populando outros campos
       */
      public InfoDeslig<T> setPensAlim(String pensAlim) {
        if (!"0".equals(pensAlim)
            && !"1".equals(pensAlim)
            && !"2".equals(pensAlim)
            && !"3".equals(pensAlim))
          throw new RuntimeException(
              "Valor " + String.valueOf(pensAlim) + " inválido para o campo pensAlim");
        this.pensAlim = pensAlim;
        return this;
      }
      /**
       * Não existe pensão alimentícia
       *
       * @return O próprio InfoDeslig para continuar populando outros campos
       */
      public InfoDeslig<T> setPensAlim_0() {
        this.pensAlim = "0";
        return this;
      }
      /**
       * Percentual de pensão alimentícia
       *
       * @return O próprio InfoDeslig para continuar populando outros campos
       */
      public InfoDeslig<T> setPensAlim_1() {
        this.pensAlim = "1";
        return this;
      }
      /**
       * Valor de pensão alimentícia
       *
       * @return O próprio InfoDeslig para continuar populando outros campos
       */
      public InfoDeslig<T> setPensAlim_2() {
        this.pensAlim = "2";
        return this;
      }
      /**
       * Percentual e valor de pensão alimentícia
       *
       * @return O próprio InfoDeslig para continuar populando outros campos
       */
      public InfoDeslig<T> setPensAlim_3() {
        this.pensAlim = "3";
        return this;
      }

      /**
       * Percentual a ser destinado a pensão alimentícia.
       *
       * @return Conteúdo do campo percAliment
       */
      public Double getPercAliment() {
        return this.percAliment;
      }

      /**
       * Percentual a ser destinado a pensão alimentícia.
       *
       * <p>Validação: Deve ser maior que 0 (zero) e menor ou igual a 100 (cem).
       *
       * <p>Informação obrigatória e exclusiva se {pensAlim}(./pensAlim) = [1, 3].
       *
       * @param percAliment Valor para atribuir ao campo percAliment
       * @return O próprio InfoDeslig para continuar populando outros campos
       */
      public InfoDeslig<T> setPercAliment(Double percAliment) {
        this.percAliment = percAliment;
        return this;
      }

      /**
       * Valor da pensão alimentícia.
       *
       * @return Conteúdo do campo vrAlim
       */
      public Double getVrAlim() {
        return this.vrAlim;
      }

      /**
       * Valor da pensão alimentícia.
       *
       * <p>Validação: Deve ser maior que 0 (zero).
       *
       * <p>Informação obrigatória e exclusiva se {pensAlim}(./pensAlim) = [2, 3].
       *
       * @param vrAlim Valor para atribuir ao campo vrAlim
       * @return O próprio InfoDeslig para continuar populando outros campos
       */
      public InfoDeslig<T> setVrAlim(Double vrAlim) {
        this.vrAlim = vrAlim;
        return this;
      }

      /**
       * Número que identifica o processo trabalhista, quando o desligamento se der por decisão
       * judicial.
       *
       * @return Conteúdo do campo nrProcTrab
       */
      public String getNrProcTrab() {
        return this.nrProcTrab;
      }

      /**
       * Número que identifica o processo trabalhista, quando o desligamento se der por decisão
       * judicial.
       *
       * <p>Validação: Se preenchido, deve ser um processo judicial válido, com 20 (vinte)
       * algarismos.
       *
       * @param nrProcTrab Valor para atribuir ao campo nrProcTrab
       * @return O próprio InfoDeslig para continuar populando outros campos
       */
      public InfoDeslig<T> setNrProcTrab(String nrProcTrab) {
        this.nrProcTrab = nrProcTrab;
        return this;
      }

      /**
       * Informações relativas ao trabalho intermitente.
       *
       * @return Conteúdo do campo infoInterm
       */
      public java.util.List<Tipos.T_infoInterm> getInfoInterm() {
        return this.infoInterm;
      }

      /**
       * Informações relativas ao trabalho intermitente.
       *
       * <p>- Esse campo pode ser repetido até 31 vezes
       *
       * <p>CHAVE_GRUPO: {dia}
       *
       * <p>CONDICAO_GRUPO: O (se o código de categoria no RET for igual a [111] no mês/ano de
       * {dtDeslig}(2299_infoDeslig_dtDeslig); N (nos demais casos)
       *
       * @return O objeto Tipos.T_infoInterm para população dos campos filhos
       */
      public Tipos.T_infoInterm<InfoDeslig<T>> setInfoInterm_Next() {
        if (this.infoInterm == null) {
          this.infoInterm = new java.util.ArrayList<>();
        }
        Tipos.T_infoInterm toAdd = new Tipos.T_infoInterm(this);
        this.infoInterm.add(toAdd);
        return toAdd;
      }

      /**
       * Observações sobre o desligamento.
       *
       * @return Conteúdo do campo observacoes
       */
      public java.util.List<Observacoes> getObservacoes() {
        return this.observacoes;
      }

      /**
       * Observações sobre o desligamento.
       *
       * <p>- Esse campo pode ser repetido até 99 vezes
       *
       * <p>CONDICAO_GRUPO: OC
       *
       * @return O objeto Observacoes para população dos campos filhos
       */
      public Observacoes<InfoDeslig<T>> setObservacoes_Next() {
        if (this.observacoes == null) {
          this.observacoes = new java.util.ArrayList<>();
        }
        Observacoes toAdd = new Observacoes(this);
        this.observacoes.add(toAdd);
        return toAdd;
      }

      /**
       * Sucessão do vínculo trabalhista/estatutário
       *
       * @return Conteúdo do campo sucessaoVinc
       */
      public SucessaoVinc getSucessaoVinc() {
        return this.sucessaoVinc;
      }

      /**
       * Sucessão do vínculo trabalhista/estatutário
       *
       * <p>DESCRICAO_COMPLETA:Grupo preenchido exclusivamente nos casos de sucessão do vínculo
       * trabalhista, com a identificação da empresa sucessora.
       *
       * <p>CONDICAO_GRUPO: O (se {mtvDeslig}(2299_infoDeslig_mtvDeslig) = [11, 12, 13, 25, 28, 29,
       * 30, 37]); N (nos demais casos)
       *
       * @return O objeto SucessaoVinc para população dos campos filhos
       */
      public SucessaoVinc<InfoDeslig<T>> setSucessaoVinc() {
        if (this.sucessaoVinc == null) {
          this.sucessaoVinc = new SucessaoVinc(this);
        }
        return this.sucessaoVinc;
      }

      /**
       * Transferência de titularidade do empregado doméstico
       *
       * @return Conteúdo do campo transfTit
       */
      public TransfTit getTransfTit() {
        return this.transfTit;
      }

      /**
       * Transferência de titularidade do empregado doméstico
       *
       * <p>DESCRICAO_COMPLETA:Transferência de titularidade do empregado doméstico para outro
       * representante da mesma unidade familiar.
       *
       * <p>CONDICAO_GRUPO: O (se {mtvDeslig}(2299_infoDeslig_mtvDeslig) = [34]); N (nos demais
       * casos)
       *
       * @return O objeto TransfTit para população dos campos filhos
       */
      public TransfTit<InfoDeslig<T>> setTransfTit() {
        if (this.transfTit == null) {
          this.transfTit = new TransfTit(this);
        }
        return this.transfTit;
      }

      /**
       * Informação do novo CPF do trabalhador.
       *
       * @return Conteúdo do campo mudancaCPF
       */
      public MudancaCPF getMudancaCPF() {
        return this.mudancaCPF;
      }

      /**
       * Informação do novo CPF do trabalhador.
       *
       * <p>CONDICAO_GRUPO: O (se {mtvDeslig}(2299_infoDeslig_mtvDeslig) = [36]); N (nos demais
       * casos)
       *
       * @return O objeto MudancaCPF para população dos campos filhos
       */
      public MudancaCPF<InfoDeslig<T>> setMudancaCPF() {
        if (this.mudancaCPF == null) {
          this.mudancaCPF = new MudancaCPF(this);
        }
        return this.mudancaCPF;
      }

      /**
       * Verbas rescisórias
       *
       * @return Conteúdo do campo verbasResc
       */
      public VerbasResc getVerbasResc() {
        return this.verbasResc;
      }

      /**
       * Verbas rescisórias
       *
       * <p>DESCRICAO_COMPLETA:Grupo onde são prestadas as informações relativas às verbas devidas
       * ao trabalhador na rescisão contratual.
       *
       * <p>CONDICAO_GRUPO: N (se {mtvDeslig}(2299_infoDeslig_mtvDeslig) = [11, 12, 13, 25, 28, 29,
       * 30, 34, 36] OU {dtDeslig}(2299_infoDeslig_dtDeslig) for anterior ao início de
       * obrigatoriedade dos eventos periódicos para o empregador OU
       * {tpRegTrab}(2200_vinculo_tpRegTrab) em S-2200 = [2]); OC (nos demais casos)
       *
       * @return O objeto VerbasResc para população dos campos filhos
       */
      public VerbasResc<InfoDeslig<T>> setVerbasResc() {
        if (this.verbasResc == null) {
          this.verbasResc = new VerbasResc(this);
        }
        return this.verbasResc;
      }

      /**
       * Informações sobre a quarentena remunerada ou outra situação de desligamento com data
       * anterior
       *
       * @return Conteúdo do campo quarentena
       */
      public Quarentena getQuarentena() {
        return this.quarentena;
      }

      /**
       * Informações sobre a quarentena remunerada ou outra situação de desligamento com data
       * anterior
       *
       * <p>DESCRICAO_COMPLETA:Informações sobre a "quarentena" remunerada de trabalhador desligado
       * ou outra situação de desligamento com data anterior.
       *
       * <p>O grupo deve ser preenchido apenas no caso do trabalhador que recebe remuneração após o
       * desligamento por estar impossibilitado de exercer atividade remunerada, no caso de
       * desligamento reconhecido judicialmente com data anterior a competências com remunerações já
       * informadas ou em caso de concessão de aposentadoria de servidor com data anterior a
       * competências com remunerações já informadas no eSocial.
       *
       * <p>CONDICAO_GRUPO: OC
       *
       * @return O objeto Quarentena para população dos campos filhos
       */
      public Quarentena<InfoDeslig<T>> setQuarentena() {
        if (this.quarentena == null) {
          this.quarentena = new Quarentena(this);
        }
        return this.quarentena;
      }

      /**
       * Informações sobre operação de crédito consignado com garantia de FGTS.
       *
       * @return Conteúdo do campo consigFGTS
       */
      public java.util.List<ConsigFGTS> getConsigFGTS() {
        return this.consigFGTS;
      }

      /**
       * Informações sobre operação de crédito consignado com garantia de FGTS.
       *
       * <p>- Esse campo pode ser repetido até 99 vezes
       *
       * <p>CONDICAO_GRUPO: OC
       *
       * @return O objeto ConsigFGTS para população dos campos filhos
       */
      public ConsigFGTS<InfoDeslig<T>> setConsigFGTS_Next() {
        if (this.consigFGTS == null) {
          this.consigFGTS = new java.util.ArrayList<>();
        }
        ConsigFGTS toAdd = new ConsigFGTS(this);
        this.consigFGTS.add(toAdd);
        return toAdd;
      }

      public InfoDeslig(Object pai) {
        this.pai = pai;
      }

      @XmlTransient private final Object pai;

      /**
       * Finaliza a população dos campos filhos desse nível
       *
       * @return O nível anterior da árvore
       */
      public T finish() {
        return (T) pai;
      }
      /**
       * Observações sobre o desligamento.
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "observacao",
          })
      public static class Observacoes<T> {

        /**
         * Observação relevante sobre o desligamento do trabalhador, que não esteja consignada em
         * outros campos.
         */
        private String observacao;

        /**
         * Observação relevante sobre o desligamento do trabalhador, que não esteja consignada em
         * outros campos.
         *
         * @return Conteúdo do campo observacao
         */
        public String getObservacao() {
          return this.observacao;
        }

        /**
         * Observação relevante sobre o desligamento do trabalhador, que não esteja consignada em
         * outros campos.
         *
         * @param observacao Valor para atribuir ao campo observacao
         * @return O próprio Observacoes para continuar populando outros campos
         */
        public Observacoes<T> setObservacao(String observacao) {
          this.observacao = observacao;
          return this;
        }

        public Observacoes(Object pai) {
          this.pai = pai;
        }

        @XmlTransient private final Object pai;

        /**
         * Finaliza a população dos campos filhos desse nível
         *
         * @return O nível anterior da árvore
         */
        public T finish() {
          return (T) pai;
        }
      }

      /**
       * Sucessão do vínculo trabalhista/estatutário
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "tpInsc", "nrInsc",
          })
      public static class SucessaoVinc<T> {

        /** Preencher com o código correspondente ao tipo de inscrição, conforme Tabela 05. */
        private String tpInsc;

        /**
         * Informar o número de inscrição do empregador sucessor, de acordo com o tipo de inscrição
         * indicado no campo {sucessaoVinc/tpInsc}(./tpInsc).
         */
        private String nrInsc;

        /**
         * Preencher com o código correspondente ao tipo de inscrição, conforme Tabela 05.
         *
         * @return Conteúdo do campo tpInsc
         */
        public String getTpInsc() {
          return this.tpInsc;
        }

        /**
         * Preencher com o código correspondente ao tipo de inscrição, conforme Tabela 05.
         *
         * @param tpInsc Valor para atribuir ao campo tpInsc
         * @return O próprio SucessaoVinc para continuar populando outros campos
         */
        public SucessaoVinc<T> setTpInsc(String tpInsc) {
          if (!"1".equals(tpInsc) && !"2".equals(tpInsc))
            throw new RuntimeException(
                "Valor " + String.valueOf(tpInsc) + " inválido para o campo tpInsc");
          this.tpInsc = tpInsc;
          return this;
        }
        /**
         * CNPJ
         *
         * @return O próprio SucessaoVinc para continuar populando outros campos
         */
        public SucessaoVinc<T> setTpInsc_1() {
          this.tpInsc = "1";
          return this;
        }
        /**
         * CPF
         *
         * @return O próprio SucessaoVinc para continuar populando outros campos
         */
        public SucessaoVinc<T> setTpInsc_2() {
          this.tpInsc = "2";
          return this;
        }

        /**
         * Informar o número de inscrição do empregador sucessor, de acordo com o tipo de inscrição
         * indicado no campo {sucessaoVinc/tpInsc}(./tpInsc).
         *
         * @return Conteúdo do campo nrInsc
         */
        public String getNrInsc() {
          return this.nrInsc;
        }

        /**
         * Informar o número de inscrição do empregador sucessor, de acordo com o tipo de inscrição
         * indicado no campo {sucessaoVinc/tpInsc}(./tpInsc).
         *
         * <p>Validação: Deve ser um número de inscrição válido e diferente da inscrição do
         * declarante, considerando as particularidades aplicadas à informação de CNPJ de órgão
         * público em S-1000.
         *
         * <p>Se {sucessaoVinc/tpInsc}(./tpInsc) = [1], deve possuir 14 (catorze) algarismos e ser
         * diferente do CNPJ base do empregador (exceto se
         * {ideEmpregador/nrInsc}(2299_ideEmpregador_nrInsc) tiver 14 (catorze) algarismos) e dos
         * estabelecimentos informados através do evento S-1005.
         *
         * <p>Se {sucessaoVinc/tpInsc}(./tpInsc) = [2], deve possuir 11 (onze) algarismos.
         *
         * @param nrInsc Valor para atribuir ao campo nrInsc
         * @return O próprio SucessaoVinc para continuar populando outros campos
         */
        public SucessaoVinc<T> setNrInsc(String nrInsc) {
          this.nrInsc = nrInsc;
          return this;
        }

        public SucessaoVinc(Object pai) {
          this.pai = pai;
        }

        @XmlTransient private final Object pai;

        /**
         * Finaliza a população dos campos filhos desse nível
         *
         * @return O nível anterior da árvore
         */
        public T finish() {
          return (T) pai;
        }
      }

      /**
       * Transferência de titularidade do empregado doméstico
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "cpfSubstituto",
            "dtNascto",
          })
      public static class TransfTit<T> {

        /** Preencher com o CPF do novo titular. */
        private String cpfSubstituto;

        /** Preencher com a data de nascimento do novo titular. */
        private javax.xml.datatype.XMLGregorianCalendar dtNascto;

        /**
         * Preencher com o CPF do novo titular.
         *
         * @return Conteúdo do campo cpfSubstituto
         */
        public String getCpfSubstituto() {
          return this.cpfSubstituto;
        }

        /**
         * Preencher com o CPF do novo titular.
         *
         * <p>Validação: Deve ser um CPF válido e diferente do CPF do declarante e do empregado.
         *
         * @param cpfSubstituto Valor para atribuir ao campo cpfSubstituto
         * @return O próprio TransfTit para continuar populando outros campos
         */
        public TransfTit<T> setCpfSubstituto(String cpfSubstituto) {
          this.cpfSubstituto = cpfSubstituto;
          return this;
        }

        /**
         * Preencher com a data de nascimento do novo titular.
         *
         * @return Conteúdo do campo dtNascto
         */
        public javax.xml.datatype.XMLGregorianCalendar getDtNascto() {
          return this.dtNascto;
        }

        /**
         * Preencher com a data de nascimento do novo titular.
         *
         * <p>Validação: Deve corresponder à data de nascimento cadastrada na base de dados do CPF
         * do {cpfSubstituto}(./cpfSubstituto).
         *
         * @param dtNascto Valor para atribuir ao campo dtNascto
         * @return O próprio TransfTit para continuar populando outros campos
         */
        public TransfTit<T> setDtNascto(javax.xml.datatype.XMLGregorianCalendar dtNascto) {
          this.dtNascto = dtNascto;
          return this;
        }

        public TransfTit(Object pai) {
          this.pai = pai;
        }

        @XmlTransient private final Object pai;

        /**
         * Finaliza a população dos campos filhos desse nível
         *
         * @return O nível anterior da árvore
         */
        public T finish() {
          return (T) pai;
        }
      }

      /**
       * Informação do novo CPF do trabalhador.
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "novoCPF",
          })
      public static class MudancaCPF<T> {

        /** Preencher com o novo CPF do trabalhador. */
        private String novoCPF;

        /**
         * Preencher com o novo CPF do trabalhador.
         *
         * @return Conteúdo do campo novoCPF
         */
        public String getNovoCPF() {
          return this.novoCPF;
        }

        /**
         * Preencher com o novo CPF do trabalhador.
         *
         * <p>Validação: Deve ser um CPF válido e diferente do CPF do empregador e do antigo CPF do
         * trabalhador.
         *
         * @param novoCPF Valor para atribuir ao campo novoCPF
         * @return O próprio MudancaCPF para continuar populando outros campos
         */
        public MudancaCPF<T> setNovoCPF(String novoCPF) {
          this.novoCPF = novoCPF;
          return this;
        }

        public MudancaCPF(Object pai) {
          this.pai = pai;
        }

        @XmlTransient private final Object pai;

        /**
         * Finaliza a população dos campos filhos desse nível
         *
         * @return O nível anterior da árvore
         */
        public T finish() {
          return (T) pai;
        }
      }

      /**
       * Verbas rescisórias
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "dmDev",
            "procJudTrab",
            "infoMV",
            "procCS",
          })
      public static class VerbasResc<T> {

        /**
         * Demonstrativo de valores devidos ao trabalhador
         *
         * <p>- Esse campo pode ser repetido até 50 vezes
         */
        private java.util.List<DmDev> dmDev;

        /**
         * Informações sobre a existência de processos judiciais do trabalhador
         *
         * <p>- Esse campo pode ser repetido até 99 vezes
         */
        private java.util.List<Tipos.T_procJudTrab> procJudTrab;

        /** Informação de múltiplos vínculos */
        private Tipos.T_infoMV infoMV;

        /**
         * Informação sobre processo judicial que suspende a exigibilidade da Contribuição Social
         * Rescisória.
         */
        private ProcCS procCS;

        /**
         * Demonstrativo de valores devidos ao trabalhador
         *
         * @return Conteúdo do campo dmDev
         */
        public java.util.List<DmDev> getDmDev() {
          return this.dmDev;
        }

        /**
         * Demonstrativo de valores devidos ao trabalhador
         *
         * <p>- Esse campo pode ser repetido até 50 vezes
         *
         * <p>DESCRICAO_COMPLETA:Identificação de cada um dos demonstrativos de valores devidos ao
         * trabalhador.
         *
         * <p>CHAVE_GRUPO: {ideDmDev}
         *
         * <p>REGRA:REGRA_DEMONSTRATIVO
         *
         * @return O objeto DmDev para população dos campos filhos
         */
        public DmDev<VerbasResc<T>> setDmDev_Next() {
          if (this.dmDev == null) {
            this.dmDev = new java.util.ArrayList<>();
          }
          DmDev toAdd = new DmDev(this);
          this.dmDev.add(toAdd);
          return toAdd;
        }

        /**
         * Informações sobre a existência de processos judiciais do trabalhador
         *
         * @return Conteúdo do campo procJudTrab
         */
        public java.util.List<Tipos.T_procJudTrab> getProcJudTrab() {
          return this.procJudTrab;
        }

        /**
         * Informações sobre a existência de processos judiciais do trabalhador
         *
         * <p>- Esse campo pode ser repetido até 99 vezes
         *
         * <p>DESCRICAO_COMPLETA:Informações sobre a existência de processos judiciais do
         * trabalhador com decisão favorável quanto à não incidência de contribuições sociais e/ou
         * Imposto de Renda.
         *
         * <p>CHAVE_GRUPO: {tpTrib}, {nrProcJud}, {codSusp}
         *
         * <p>CONDICAO_GRUPO: OC
         *
         * @return O objeto Tipos.T_procJudTrab para população dos campos filhos
         */
        public Tipos.T_procJudTrab<VerbasResc<T>> setProcJudTrab_Next() {
          if (this.procJudTrab == null) {
            this.procJudTrab = new java.util.ArrayList<>();
          }
          Tipos.T_procJudTrab toAdd = new Tipos.T_procJudTrab(this);
          this.procJudTrab.add(toAdd);
          return toAdd;
        }

        /**
         * Informação de múltiplos vínculos
         *
         * @return Conteúdo do campo infoMV
         */
        public Tipos.T_infoMV getInfoMV() {
          return this.infoMV;
        }

        /**
         * Informação de múltiplos vínculos
         *
         * <p>DESCRICAO_COMPLETA:Grupo preenchido exclusivamente em caso de trabalhador que possua
         * outros vínculos/atividades nos quais já tenha ocorrido desconto de contribuição
         * previdenciária.
         *
         * <p>CONDICAO_GRUPO: OC
         *
         * @return O objeto Tipos.T_infoMV para população dos campos filhos
         */
        public Tipos.T_infoMV<VerbasResc<T>> setInfoMV() {
          if (this.infoMV == null) {
            this.infoMV = new Tipos.T_infoMV(this);
          }
          return this.infoMV;
        }

        /**
         * Informação sobre processo judicial que suspende a exigibilidade da Contribuição Social
         * Rescisória.
         *
         * @return Conteúdo do campo procCS
         */
        public ProcCS getProcCS() {
          return this.procCS;
        }

        /**
         * Informação sobre processo judicial que suspende a exigibilidade da Contribuição Social
         * Rescisória.
         *
         * <p>CONDICAO_GRUPO: OC
         *
         * @return O objeto ProcCS para população dos campos filhos
         */
        public ProcCS<VerbasResc<T>> setProcCS() {
          if (this.procCS == null) {
            this.procCS = new ProcCS(this);
          }
          return this.procCS;
        }

        public VerbasResc(Object pai) {
          this.pai = pai;
        }

        @XmlTransient private final Object pai;

        /**
         * Finaliza a população dos campos filhos desse nível
         *
         * @return O nível anterior da árvore
         */
        public T finish() {
          return (T) pai;
        }
        /**
         * Demonstrativo de valores devidos ao trabalhador
         *
         * @param <T> Tipo do retorno do método finish()
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(
            name = "",
            propOrder = {
              "ideDmDev",
              "infoPerApur",
              "infoPerAnt",
            })
        public static class DmDev<T> {

          /**
           * Identificador atribuído pela empresa para o demonstrativo de valores devidos ao
           * trabalhador relativo a verbas rescisórias.
           */
          private String ideDmDev;

          /** Verbas rescisórias relativas ao mês/ano da data do desligamento. */
          private InfoPerApur infoPerApur;

          /** Informações relativas a períodos anteriores */
          private InfoPerAnt infoPerAnt;

          /**
           * Identificador atribuído pela empresa para o demonstrativo de valores devidos ao
           * trabalhador relativo a verbas rescisórias.
           *
           * @return Conteúdo do campo ideDmDev
           */
          public String getIdeDmDev() {
            return this.ideDmDev;
          }

          /**
           * Identificador atribuído pela empresa para o demonstrativo de valores devidos ao
           * trabalhador relativo a verbas rescisórias.
           *
           * <p>Validação: Deve ser um identificador único dentro da mesma competência (mês/ano da
           * data de desligamento) para cada um dos demonstrativos do trabalhador.
           *
           * <p>REGRA:REGRA_CARACTERE_ESPECIAL
           *
           * @param ideDmDev Valor para atribuir ao campo ideDmDev
           * @return O próprio DmDev para continuar populando outros campos
           */
          public DmDev<T> setIdeDmDev(String ideDmDev) {
            this.ideDmDev = ideDmDev;
            return this;
          }

          /**
           * Verbas rescisórias relativas ao mês/ano da data do desligamento.
           *
           * @return Conteúdo do campo infoPerApur
           */
          public InfoPerApur getInfoPerApur() {
            return this.infoPerApur;
          }

          /**
           * Verbas rescisórias relativas ao mês/ano da data do desligamento.
           *
           * <p>CONDICAO_GRUPO: O (se não existir o grupo
           * {infoPerAnt}(2299_infoDeslig_verbasResc_dmDev_infoPerAnt)); OC (nos demais casos)
           *
           * @return O objeto InfoPerApur para população dos campos filhos
           */
          public InfoPerApur<DmDev<T>> setInfoPerApur() {
            if (this.infoPerApur == null) {
              this.infoPerApur = new InfoPerApur(this);
            }
            return this.infoPerApur;
          }

          /**
           * Informações relativas a períodos anteriores
           *
           * @return Conteúdo do campo infoPerAnt
           */
          public InfoPerAnt getInfoPerAnt() {
            return this.infoPerAnt;
          }

          /**
           * Informações relativas a períodos anteriores
           *
           * <p>DESCRICAO_COMPLETA:Remuneração relativa a períodos anteriores, devida em função de
           * acordos coletivos, legislação específica, convenção coletiva de trabalho, dissídio ou
           * conversão de licença saúde em acidente de trabalho.
           *
           * <p>CONDICAO_GRUPO: O (se não existir o grupo
           * {infoPerApur}(2299_infoDeslig_verbasResc_dmDev_infoPerApur)); OC (nos demais casos)
           *
           * @return O objeto InfoPerAnt para população dos campos filhos
           */
          public InfoPerAnt<DmDev<T>> setInfoPerAnt() {
            if (this.infoPerAnt == null) {
              this.infoPerAnt = new InfoPerAnt(this);
            }
            return this.infoPerAnt;
          }

          public DmDev(Object pai) {
            this.pai = pai;
          }

          @XmlTransient private final Object pai;

          /**
           * Finaliza a população dos campos filhos desse nível
           *
           * @return O nível anterior da árvore
           */
          public T finish() {
            return (T) pai;
          }
          /**
           * Verbas rescisórias relativas ao mês/ano da data do desligamento.
           *
           * @param <T> Tipo do retorno do método finish()
           */
          @XmlAccessorType(XmlAccessType.FIELD)
          @XmlType(
              name = "",
              propOrder = {
                "ideEstabLot",
              })
          public static class InfoPerApur<T> {

            /**
             * Identificação do estabelecimento e lotação
             *
             * <p>- Esse campo pode ser repetido até 24 vezes
             */
            private java.util.List<T_ideEstabLot> ideEstabLot;

            /**
             * Identificação do estabelecimento e lotação
             *
             * @return Conteúdo do campo ideEstabLot
             */
            public java.util.List<T_ideEstabLot> getIdeEstabLot() {
              return this.ideEstabLot;
            }

            /**
             * Identificação do estabelecimento e lotação
             *
             * <p>- Esse campo pode ser repetido até 24 vezes
             *
             * <p>DESCRICAO_COMPLETA:Identificação do estabelecimento e da lotação nos quais o
             * trabalhador possui remuneração no período de apuração. O estabelecimento identificado
             * no grupo pode ser: o número do CNPJ do estabelecimento da própria empresa
             * (matriz/filial), o número da obra (própria) no CNO, ou o número do CAEPF (no caso de
             * pessoa física obrigada a inscrição no cadastro de atividades econômicas da pessoa
             * física). No caso específico do trabalhador doméstico, o estabelecimento deve ser o
             * próprio CPF do empregador.
             *
             * <p>CHAVE_GRUPO: {tpInsc}, {nrInsc}, {codLotacao}
             *
             * @return O objeto T_ideEstabLot para população dos campos filhos
             */
            public T_ideEstabLot<InfoPerApur<T>> setIdeEstabLot_Next() {
              if (this.ideEstabLot == null) {
                this.ideEstabLot = new java.util.ArrayList<>();
              }
              T_ideEstabLot toAdd = new T_ideEstabLot(this);
              this.ideEstabLot.add(toAdd);
              return toAdd;
            }

            public InfoPerApur(Object pai) {
              this.pai = pai;
            }

            @XmlTransient private final Object pai;

            /**
             * Finaliza a população dos campos filhos desse nível
             *
             * @return O nível anterior da árvore
             */
            public T finish() {
              return (T) pai;
            }
          }

          /**
           * Informações relativas a períodos anteriores
           *
           * @param <T> Tipo do retorno do método finish()
           */
          @XmlAccessorType(XmlAccessType.FIELD)
          @XmlType(
              name = "",
              propOrder = {
                "ideADC",
              })
          public static class InfoPerAnt<T> {

            /**
             * Instrumento ou situação ensejadora da remuneração em períodos anteriores
             *
             * <p>- Esse campo pode ser repetido até 8 vezes
             */
            private java.util.List<IdeADC> ideADC;

            /**
             * Instrumento ou situação ensejadora da remuneração em períodos anteriores
             *
             * @return Conteúdo do campo ideADC
             */
            public java.util.List<IdeADC> getIdeADC() {
              return this.ideADC;
            }

            /**
             * Instrumento ou situação ensejadora da remuneração em períodos anteriores
             *
             * <p>- Esse campo pode ser repetido até 8 vezes
             *
             * <p>DESCRICAO_COMPLETA:Identificação do instrumento ou situação ensejadora da
             * remuneração relativa a períodos de apuração anteriores.
             *
             * <p>CHAVE_GRUPO: {dtAcConv}, {tpAcConv}
             *
             * @return O objeto IdeADC para população dos campos filhos
             */
            public IdeADC<InfoPerAnt<T>> setIdeADC_Next() {
              if (this.ideADC == null) {
                this.ideADC = new java.util.ArrayList<>();
              }
              IdeADC toAdd = new IdeADC(this);
              this.ideADC.add(toAdd);
              return toAdd;
            }

            public InfoPerAnt(Object pai) {
              this.pai = pai;
            }

            @XmlTransient private final Object pai;

            /**
             * Finaliza a população dos campos filhos desse nível
             *
             * @return O nível anterior da árvore
             */
            public T finish() {
              return (T) pai;
            }
            /**
             * Instrumento ou situação ensejadora da remuneração em períodos anteriores
             *
             * @param <T> Tipo do retorno do método finish()
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(
                name = "",
                propOrder = {
                  "dtAcConv",
                  "tpAcConv",
                  "dsc",
                  "idePeriodo",
                })
            public static class IdeADC<T> {

              /**
               * Data da assinatura do acordo, convenção coletiva, sentença normativa ou da
               * conversão da licença saúde em acidente de trabalho.
               */
              private javax.xml.datatype.XMLGregorianCalendar dtAcConv;

              /**
               * Tipo do instrumento ou situação ensejadora da remuneração relativa a períodos de
               * apuração anteriores.
               */
              private String tpAcConv;

              /**
               * Descrição do instrumento ou situação que originou o pagamento das verbas relativas
               * a períodos anteriores.
               */
              private String dsc;

              /**
               * Identificação do período de referência da remuneração
               *
               * <p>- Esse campo pode ser repetido até 180 vezes
               */
              private java.util.List<IdePeriodo> idePeriodo;

              /**
               * Data da assinatura do acordo, convenção coletiva, sentença normativa ou da
               * conversão da licença saúde em acidente de trabalho.
               *
               * @return Conteúdo do campo dtAcConv
               */
              public javax.xml.datatype.XMLGregorianCalendar getDtAcConv() {
                return this.dtAcConv;
              }

              /**
               * Data da assinatura do acordo, convenção coletiva, sentença normativa ou da
               * conversão da licença saúde em acidente de trabalho.
               *
               * <p>Validação: Informação obrigatória se {tpAcConv}(./tpAcConv) = [A, B, C, D, E].
               * Se preenchida, seu mês/ano deve ser igual ou anterior ao mês/ano da data de
               * desligamento, em {dtDeslig}(2299_infoDeslig_dtDeslig). A data deve ser igual ou
               * posterior a 01/01/1890.
               *
               * @param dtAcConv Valor para atribuir ao campo dtAcConv
               * @return O próprio IdeADC para continuar populando outros campos
               */
              public IdeADC<T> setDtAcConv(javax.xml.datatype.XMLGregorianCalendar dtAcConv) {
                this.dtAcConv = dtAcConv;
                return this;
              }

              /**
               * Tipo do instrumento ou situação ensejadora da remuneração relativa a períodos de
               * apuração anteriores.
               *
               * @return Conteúdo do campo tpAcConv
               */
              public String getTpAcConv() {
                return this.tpAcConv;
              }

              /**
               * Tipo do instrumento ou situação ensejadora da remuneração relativa a períodos de
               * apuração anteriores.
               *
               * @param tpAcConv Valor para atribuir ao campo tpAcConv
               * @return O próprio IdeADC para continuar populando outros campos
               */
              public IdeADC<T> setTpAcConv(String tpAcConv) {
                if (!"A".equals(tpAcConv)
                    && !"B".equals(tpAcConv)
                    && !"C".equals(tpAcConv)
                    && !"D".equals(tpAcConv)
                    && !"E".equals(tpAcConv)
                    && !"G".equals(tpAcConv))
                  throw new RuntimeException(
                      "Valor " + String.valueOf(tpAcConv) + " inválido para o campo tpAcConv");
                this.tpAcConv = tpAcConv;
                return this;
              }
              /**
               * Acordo Coletivo de Trabalho
               *
               * @return O próprio IdeADC para continuar populando outros campos
               */
              public IdeADC<T> setTpAcConv_A() {
                this.tpAcConv = "A";
                return this;
              }
              /**
               * Legislação federal, estadual, municipal ou distrital
               *
               * @return O próprio IdeADC para continuar populando outros campos
               */
              public IdeADC<T> setTpAcConv_B() {
                this.tpAcConv = "B";
                return this;
              }
              /**
               * Convenção Coletiva de Trabalho
               *
               * @return O próprio IdeADC para continuar populando outros campos
               */
              public IdeADC<T> setTpAcConv_C() {
                this.tpAcConv = "C";
                return this;
              }
              /**
               * Sentença normativa - Dissídio
               *
               * @return O próprio IdeADC para continuar populando outros campos
               */
              public IdeADC<T> setTpAcConv_D() {
                this.tpAcConv = "D";
                return this;
              }
              /**
               * Conversão de licença saúde em acidente de trabalho
               *
               * @return O próprio IdeADC para continuar populando outros campos
               */
              public IdeADC<T> setTpAcConv_E() {
                this.tpAcConv = "E";
                return this;
              }
              /**
               * Antecipação de diferenças de acordo, convenção ou dissídio coletivo
               *
               * @return O próprio IdeADC para continuar populando outros campos
               */
              public IdeADC<T> setTpAcConv_G() {
                this.tpAcConv = "G";
                return this;
              }

              /**
               * Descrição do instrumento ou situação que originou o pagamento das verbas relativas
               * a períodos anteriores.
               *
               * @return Conteúdo do campo dsc
               */
              public String getDsc() {
                return this.dsc;
              }

              /**
               * Descrição do instrumento ou situação que originou o pagamento das verbas relativas
               * a períodos anteriores.
               *
               * @param dsc Valor para atribuir ao campo dsc
               * @return O próprio IdeADC para continuar populando outros campos
               */
              public IdeADC<T> setDsc(String dsc) {
                this.dsc = dsc;
                return this;
              }

              /**
               * Identificação do período de referência da remuneração
               *
               * @return Conteúdo do campo idePeriodo
               */
              public java.util.List<IdePeriodo> getIdePeriodo() {
                return this.idePeriodo;
              }

              /**
               * Identificação do período de referência da remuneração
               *
               * <p>- Esse campo pode ser repetido até 180 vezes
               *
               * <p>DESCRICAO_COMPLETA:Identificação do período ao qual se referem as diferenças de
               * remuneração.
               *
               * <p>CHAVE_GRUPO: {perRef}
               *
               * @return O objeto IdePeriodo para população dos campos filhos
               */
              public IdePeriodo<IdeADC<T>> setIdePeriodo_Next() {
                if (this.idePeriodo == null) {
                  this.idePeriodo = new java.util.ArrayList<>();
                }
                IdePeriodo toAdd = new IdePeriodo(this);
                this.idePeriodo.add(toAdd);
                return toAdd;
              }

              public IdeADC(Object pai) {
                this.pai = pai;
              }

              @XmlTransient private final Object pai;

              /**
               * Finaliza a população dos campos filhos desse nível
               *
               * @return O nível anterior da árvore
               */
              public T finish() {
                return (T) pai;
              }
              /**
               * Identificação do período de referência da remuneração
               *
               * @param <T> Tipo do retorno do método finish()
               */
              @XmlAccessorType(XmlAccessType.FIELD)
              @XmlType(
                  name = "",
                  propOrder = {
                    "perRef",
                    "ideEstabLot",
                  })
              public static class IdePeriodo<T> {

                /**
                 * Informar o período ao qual se refere o complemento de remuneração, no formato
                 * AAAA-MM.
                 */
                private String perRef;

                /**
                 * Identificação do estabelecimento e lotação
                 *
                 * <p>- Esse campo pode ser repetido até 24 vezes
                 */
                private java.util.List<T_ideEstabLot> ideEstabLot;

                /**
                 * Informar o período ao qual se refere o complemento de remuneração, no formato
                 * AAAA-MM.
                 *
                 * @return Conteúdo do campo perRef
                 */
                public String getPerRef() {
                  return this.perRef;
                }

                /**
                 * Informar o período ao qual se refere o complemento de remuneração, no formato
                 * AAAA-MM.
                 *
                 * <p>Validação: Deve ser igual ou anterior ao mês/ano da data do desligamento,
                 * informada em {dtDeslig}(2299_infoDeslig_dtDeslig).
                 *
                 * <p>Deve ser informado no formato AAAA-MM.
                 *
                 * @param perRef Valor para atribuir ao campo perRef
                 * @return O próprio IdePeriodo para continuar populando outros campos
                 */
                public IdePeriodo<T> setPerRef(String perRef) {
                  this.perRef = perRef;
                  return this;
                }

                /**
                 * Identificação do estabelecimento e lotação
                 *
                 * @return Conteúdo do campo ideEstabLot
                 */
                public java.util.List<T_ideEstabLot> getIdeEstabLot() {
                  return this.ideEstabLot;
                }

                /**
                 * Identificação do estabelecimento e lotação
                 *
                 * <p>- Esse campo pode ser repetido até 24 vezes
                 *
                 * <p>DESCRICAO_COMPLETA:Identificação do estabelecimento e da lotação aos quais se
                 * referem as diferenças de remuneração do mês identificado no grupo superior.
                 *
                 * <p>CHAVE_GRUPO: {tpInsc}, {nrInsc}, {codLotacao}
                 *
                 * @return O objeto T_ideEstabLot para população dos campos filhos
                 */
                public T_ideEstabLot<IdePeriodo<T>> setIdeEstabLot_Next() {
                  if (this.ideEstabLot == null) {
                    this.ideEstabLot = new java.util.ArrayList<>();
                  }
                  T_ideEstabLot toAdd = new T_ideEstabLot(this);
                  this.ideEstabLot.add(toAdd);
                  return toAdd;
                }

                public IdePeriodo(Object pai) {
                  this.pai = pai;
                }

                @XmlTransient private final Object pai;

                /**
                 * Finaliza a população dos campos filhos desse nível
                 *
                 * @return O nível anterior da árvore
                 */
                public T finish() {
                  return (T) pai;
                }
              }
            }
          }
        }

        /**
         * Informação sobre processo judicial que suspende a exigibilidade da Contribuição Social
         * Rescisória.
         *
         * @param <T> Tipo do retorno do método finish()
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(
            name = "",
            propOrder = {
              "nrProcJud",
            })
        public static class ProcCS<T> {

          /**
           * Informar um número de processo judicial cadastrado através do evento S-1070, cujo
           * {indMatProc}(1070_infoProcesso_inclusao_dadosProc_indMatProc) seja igual a [1, 7].
           */
          private String nrProcJud;

          /**
           * Informar um número de processo judicial cadastrado através do evento S-1070, cujo
           * {indMatProc}(1070_infoProcesso_inclusao_dadosProc_indMatProc) seja igual a [1, 7].
           *
           * @return Conteúdo do campo nrProcJud
           */
          public String getNrProcJud() {
            return this.nrProcJud;
          }

          /**
           * Informar um número de processo judicial cadastrado através do evento S-1070, cujo
           * {indMatProc}(1070_infoProcesso_inclusao_dadosProc_indMatProc) seja igual a [1, 7].
           *
           * <p>Validação: Deve ser um número de processo judicial válido e existente na Tabela de
           * Processos (S-1070), com {indMatProc}(1070_infoProcesso_inclusao_dadosProc_indMatProc) =
           * [1, 7].
           *
           * @param nrProcJud Valor para atribuir ao campo nrProcJud
           * @return O próprio ProcCS para continuar populando outros campos
           */
          public ProcCS<T> setNrProcJud(String nrProcJud) {
            this.nrProcJud = nrProcJud;
            return this;
          }

          public ProcCS(Object pai) {
            this.pai = pai;
          }

          @XmlTransient private final Object pai;

          /**
           * Finaliza a população dos campos filhos desse nível
           *
           * @return O nível anterior da árvore
           */
          public T finish() {
            return (T) pai;
          }
        }
      }

      /**
       * Informações sobre a quarentena remunerada ou outra situação de desligamento com data
       * anterior
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "dtFimQuar",
          })
      public static class Quarentena<T> {

        /**
         * Preencher com a data final da quarentena a que está sujeito o trabalhador. No caso de
         * desligamento reconhecido judicialmente ou de concessão de aposentadoria de servidor com
         * data anterior a competências com remunerações já informadas no eSocial, informar o último
         * dia trabalhado.
         */
        private javax.xml.datatype.XMLGregorianCalendar dtFimQuar;

        /**
         * Preencher com a data final da quarentena a que está sujeito o trabalhador. No caso de
         * desligamento reconhecido judicialmente ou de concessão de aposentadoria de servidor com
         * data anterior a competências com remunerações já informadas no eSocial, informar o último
         * dia trabalhado.
         *
         * @return Conteúdo do campo dtFimQuar
         */
        public javax.xml.datatype.XMLGregorianCalendar getDtFimQuar() {
          return this.dtFimQuar;
        }

        /**
         * Preencher com a data final da quarentena a que está sujeito o trabalhador. No caso de
         * desligamento reconhecido judicialmente ou de concessão de aposentadoria de servidor com
         * data anterior a competências com remunerações já informadas no eSocial, informar o último
         * dia trabalhado.
         *
         * <p>Validação: Deve ser uma data posterior a {dtDeslig}(2299_infoDeslig_dtDeslig).
         *
         * @param dtFimQuar Valor para atribuir ao campo dtFimQuar
         * @return O próprio Quarentena para continuar populando outros campos
         */
        public Quarentena<T> setDtFimQuar(javax.xml.datatype.XMLGregorianCalendar dtFimQuar) {
          this.dtFimQuar = dtFimQuar;
          return this;
        }

        public Quarentena(Object pai) {
          this.pai = pai;
        }

        @XmlTransient private final Object pai;

        /**
         * Finaliza a população dos campos filhos desse nível
         *
         * @return O nível anterior da árvore
         */
        public T finish() {
          return (T) pai;
        }
      }

      /**
       * Informações sobre operação de crédito consignado com garantia de FGTS.
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "insConsig",
            "nrContr",
          })
      public static class ConsigFGTS<T> {

        /** Matrícula da instituição consignatária, cadastrada na Caixa Econômica Federal. */
        private String insConsig;

        /** Número do contrato de empréstimo consignado existente na instituição consignatária. */
        private String nrContr;

        /**
         * Matrícula da instituição consignatária, cadastrada na Caixa Econômica Federal.
         *
         * @return Conteúdo do campo insConsig
         */
        public String getInsConsig() {
          return this.insConsig;
        }

        /**
         * Matrícula da instituição consignatária, cadastrada na Caixa Econômica Federal.
         *
         * @param insConsig Valor para atribuir ao campo insConsig
         * @return O próprio ConsigFGTS para continuar populando outros campos
         */
        public ConsigFGTS<T> setInsConsig(String insConsig) {
          this.insConsig = insConsig;
          return this;
        }

        /**
         * Número do contrato de empréstimo consignado existente na instituição consignatária.
         *
         * @return Conteúdo do campo nrContr
         */
        public String getNrContr() {
          return this.nrContr;
        }

        /**
         * Número do contrato de empréstimo consignado existente na instituição consignatária.
         *
         * @param nrContr Valor para atribuir ao campo nrContr
         * @return O próprio ConsigFGTS para continuar populando outros campos
         */
        public ConsigFGTS<T> setNrContr(String nrContr) {
          this.nrContr = nrContr;
          return this;
        }

        public ConsigFGTS(Object pai) {
          this.pai = pai;
        }

        @XmlTransient private final Object pai;

        /**
         * Finaliza a população dos campos filhos desse nível
         *
         * @return O nível anterior da árvore
         */
        public T finish() {
          return (T) pai;
        }
      }
    }
  }

  /**
   * Identificação do estabelecimento e lotação
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "tpInsc",
        "nrInsc",
        "codLotacao",
        "detVerbas",
        "infoAgNocivo",
        "infoSimples",
      })
  public static class T_ideEstabLot<T> {

    /**
     * Preencher com o código correspondente ao tipo de inscrição do estabelecimento, de acordo com
     * as opções da Tabela 05.
     */
    private String tpInsc;

    /**
     * Informar o número de inscrição do estabelecimento do contribuinte de acordo com o tipo de
     * inscrição indicado no campo {ideEstabLot/tpInsc}(./tpInsc).
     */
    private String nrInsc;

    /** Informar o código atribuído pelo empregador para a lotação tributária. */
    private String codLotacao;

    /**
     * Detalhamento das verbas rescisórias
     *
     * <p>- Esse campo pode ser repetido até 200 vezes
     */
    private java.util.List<DetVerbas> detVerbas;

    /** Grau de exposição a agentes nocivos */
    private InfoAgNocivo infoAgNocivo;

    /** Informação relativa a empresas do Simples */
    private Tipos.T_infoSimples infoSimples;

    /**
     * Preencher com o código correspondente ao tipo de inscrição do estabelecimento, de acordo com
     * as opções da Tabela 05.
     *
     * @return Conteúdo do campo tpInsc
     */
    public String getTpInsc() {
      return this.tpInsc;
    }

    /**
     * Preencher com o código correspondente ao tipo de inscrição do estabelecimento, de acordo com
     * as opções da Tabela 05.
     *
     * <p>Validação: Se {classTrib}(1000_infoEmpregador_inclusao_infoCadastro_classTrib) em S-1000 =
     * [21], deve ser igual a [3, 4].
     *
     * <p>Se {classTrib}(1000_infoEmpregador_inclusao_infoCadastro_classTrib) em S-1000 = [22], deve
     * ser igual a [3, 4] e, se for igual a [3] e não se tratar de empregado doméstico, o CAEPF deve
     * constar na Tabela S-1005 como sendo de segurado especial.
     *
     * <p>Nos demais casos ({classTrib}(1000_infoEmpregador_inclusao_infoCadastro_classTrib) em
     * S-1000 diferente de [21, 22]), deve ser igual a [1, 4].
     *
     * @param tpInsc Valor para atribuir ao campo tpInsc
     * @return O próprio T_ideEstabLot para continuar populando outros campos
     */
    public T_ideEstabLot<T> setTpInsc(String tpInsc) {
      if (!"1".equals(tpInsc) && !"3".equals(tpInsc) && !"4".equals(tpInsc))
        throw new RuntimeException(
            "Valor " + String.valueOf(tpInsc) + " inválido para o campo tpInsc");
      this.tpInsc = tpInsc;
      return this;
    }
    /**
     * CNPJ
     *
     * @return O próprio T_ideEstabLot para continuar populando outros campos
     */
    public T_ideEstabLot<T> setTpInsc_1() {
      this.tpInsc = "1";
      return this;
    }
    /**
     * CAEPF
     *
     * @return O próprio T_ideEstabLot para continuar populando outros campos
     */
    public T_ideEstabLot<T> setTpInsc_3() {
      this.tpInsc = "3";
      return this;
    }
    /**
     * CNO
     *
     * @return O próprio T_ideEstabLot para continuar populando outros campos
     */
    public T_ideEstabLot<T> setTpInsc_4() {
      this.tpInsc = "4";
      return this;
    }

    /**
     * Informar o número de inscrição do estabelecimento do contribuinte de acordo com o tipo de
     * inscrição indicado no campo {ideEstabLot/tpInsc}(./tpInsc).
     *
     * @return Conteúdo do campo nrInsc
     */
    public String getNrInsc() {
      return this.nrInsc;
    }

    /**
     * Informar o número de inscrição do estabelecimento do contribuinte de acordo com o tipo de
     * inscrição indicado no campo {ideEstabLot/tpInsc}(./tpInsc).
     *
     * <p>Validação: A inscrição informada deve ser compatível com {ideEstabLot/tpInsc}(./tpInsc).
     *
     * @param nrInsc Valor para atribuir ao campo nrInsc
     * @return O próprio T_ideEstabLot para continuar populando outros campos
     */
    public T_ideEstabLot<T> setNrInsc(String nrInsc) {
      this.nrInsc = nrInsc;
      return this;
    }

    /**
     * Informar o código atribuído pelo empregador para a lotação tributária.
     *
     * @return Conteúdo do campo codLotacao
     */
    public String getCodLotacao() {
      return this.codLotacao;
    }

    /**
     * Informar o código atribuído pelo empregador para a lotação tributária.
     *
     * @param codLotacao Valor para atribuir ao campo codLotacao
     * @return O próprio T_ideEstabLot para continuar populando outros campos
     */
    public T_ideEstabLot<T> setCodLotacao(String codLotacao) {
      this.codLotacao = codLotacao;
      return this;
    }

    /**
     * Detalhamento das verbas rescisórias
     *
     * @return Conteúdo do campo detVerbas
     */
    public java.util.List<DetVerbas> getDetVerbas() {
      return this.detVerbas;
    }

    /**
     * Detalhamento das verbas rescisórias
     *
     * <p>- Esse campo pode ser repetido até 200 vezes
     *
     * <p>DESCRICAO_COMPLETA:Detalhamento das verbas rescisórias devidas ao trabalhador. Deve haver
     * pelo menos uma rubrica de folha, mesmo que o valor líquido a ser pago ao trabalhador seja 0
     * (zero) em função de descontos.
     *
     * @return O objeto DetVerbas para população dos campos filhos
     */
    public DetVerbas<T_ideEstabLot<T>> setDetVerbas_Next() {
      if (this.detVerbas == null) {
        this.detVerbas = new java.util.ArrayList<>();
      }
      DetVerbas toAdd = new DetVerbas(this);
      this.detVerbas.add(toAdd);
      return toAdd;
    }

    /**
     * Grau de exposição a agentes nocivos
     *
     * @return Conteúdo do campo infoAgNocivo
     */
    public InfoAgNocivo getInfoAgNocivo() {
      return this.infoAgNocivo;
    }

    /**
     * Grau de exposição a agentes nocivos
     *
     * <p>DESCRICAO_COMPLETA:Grupo referente ao detalhamento do grau de exposição do trabalhador aos
     * agentes nocivos que ensejam a cobrança da contribuição adicional para financiamento dos
     * benefícios de aposentadoria especial.
     *
     * <p>CONDICAO_GRUPO: O (se o trabalhador estiver amparado pelo RGPS); N (nos demais casos)
     *
     * @return O objeto InfoAgNocivo para população dos campos filhos
     */
    public InfoAgNocivo<T_ideEstabLot<T>> setInfoAgNocivo() {
      if (this.infoAgNocivo == null) {
        this.infoAgNocivo = new InfoAgNocivo(this);
      }
      return this.infoAgNocivo;
    }

    /**
     * Informação relativa a empresas do Simples
     *
     * @return Conteúdo do campo infoSimples
     */
    public Tipos.T_infoSimples getInfoSimples() {
      return this.infoSimples;
    }

    /**
     * Informação relativa a empresas do Simples
     *
     * <p>DESCRICAO_COMPLETA:Informação relativa a empresas enquadradas no regime de tributação
     * Simples Nacional.
     *
     * <p>CONDICAO_GRUPO: O (se {classTrib}(1000_infoEmpregador_inclusao_infoCadastro_classTrib) em
     * S-1000 = [03]); N (nos demais casos)
     *
     * @return O objeto Tipos.T_infoSimples para população dos campos filhos
     */
    public Tipos.T_infoSimples<T_ideEstabLot<T>> setInfoSimples() {
      if (this.infoSimples == null) {
        this.infoSimples = new Tipos.T_infoSimples(this);
      }
      return this.infoSimples;
    }

    public T_ideEstabLot(Object pai) {
      this.pai = pai;
    }

    @XmlTransient private final Object pai;

    /**
     * Finaliza a população dos campos filhos desse nível
     *
     * @return O nível anterior da árvore
     */
    public T finish() {
      return (T) pai;
    }
    /**
     * Detalhamento das verbas rescisórias
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "codRubr",
          "ideTabRubr",
          "qtdRubr",
          "fatorRubr",
          "vrRubr",
          "indApurIR",
        })
    public static class DetVerbas<T> {

      /**
       * Informar o código atribuído pelo empregador que identifica a rubrica em sua folha de
       * pagamento ou o código da rubrica constante da Tabela de Rubricas Padrão.
       */
      private String codRubr;

      /**
       * Preencher com o identificador da Tabela de Rubricas para a rubrica definida em
       * {codRubr}(./codRubr).
       */
      private String ideTabRubr;

      /**
       * Informar a quantidade de referência para apuração (em horas, cotas, meses, etc.). Ex.:
       * Quantidade de horas extras trabalhadas relacionada com uma rubrica de hora extra,
       * quantidade de dias trabalhados relacionada com uma rubrica de salário, etc.
       */
      private Double qtdRubr;

      /**
       * Informar o fator, percentual, etc. da rubrica, quando necessário. Ex.: Adicional de horas
       * extras 50%, relacionado a uma rubrica de horas extras: Fator = 50.
       */
      private Double fatorRubr;

      /** Valor total da rubrica. */
      private Double vrRubr;

      /** Indicativo de tipo de apuração de IR. */
      private String indApurIR;

      /**
       * Informar o código atribuído pelo empregador que identifica a rubrica em sua folha de
       * pagamento ou o código da rubrica constante da Tabela de Rubricas Padrão.
       *
       * @return Conteúdo do campo codRubr
       */
      public String getCodRubr() {
        return this.codRubr;
      }

      /**
       * Informar o código atribuído pelo empregador que identifica a rubrica em sua folha de
       * pagamento ou o código da rubrica constante da Tabela de Rubricas Padrão.
       *
       * <p>Validação: Não pode ser utilizada rubrica cuja
       * {natRubr}(1010_infoRubrica_inclusao_dadosRubrica_natRubr) em S-1010 seja igual a [1801,
       * 9209, 9210, 9220], desde que mês/ano de {dtDeslig}(2299_infoDeslig_dtDeslig) >= [2021-05].
       *
       * @param codRubr Valor para atribuir ao campo codRubr
       * @return O próprio DetVerbas para continuar populando outros campos
       */
      public DetVerbas<T> setCodRubr(String codRubr) {
        this.codRubr = codRubr;
        return this;
      }

      /**
       * Preencher com o identificador da Tabela de Rubricas para a rubrica definida em
       * {codRubr}(./codRubr).
       *
       * @return Conteúdo do campo ideTabRubr
       */
      public String getIdeTabRubr() {
        return this.ideTabRubr;
      }

      /**
       * Preencher com o identificador da Tabela de Rubricas para a rubrica definida em
       * {codRubr}(./codRubr).
       *
       * @param ideTabRubr Valor para atribuir ao campo ideTabRubr
       * @return O próprio DetVerbas para continuar populando outros campos
       */
      public DetVerbas<T> setIdeTabRubr(String ideTabRubr) {
        this.ideTabRubr = ideTabRubr;
        return this;
      }

      /**
       * Informar a quantidade de referência para apuração (em horas, cotas, meses, etc.). Ex.:
       * Quantidade de horas extras trabalhadas relacionada com uma rubrica de hora extra,
       * quantidade de dias trabalhados relacionada com uma rubrica de salário, etc.
       *
       * @return Conteúdo do campo qtdRubr
       */
      public Double getQtdRubr() {
        return this.qtdRubr;
      }

      /**
       * Informar a quantidade de referência para apuração (em horas, cotas, meses, etc.). Ex.:
       * Quantidade de horas extras trabalhadas relacionada com uma rubrica de hora extra,
       * quantidade de dias trabalhados relacionada com uma rubrica de salário, etc.
       *
       * <p>Preenchimento obrigatório quando se tratar de rubrica relativa a faltas ou Descanso
       * Semanal Remunerado - DSR sobre faltas (nesse caso, informar a quantidade de dias).
       *
       * <p>Validação: Deve ser maior que 0 (zero). Informação obrigatória se {codRubr}(./codRubr)
       * tiver {natRubr}(1010_infoRubrica_inclusao_dadosRubrica_natRubr) em S-1010 igual a [9207,
       * 9211].
       *
       * @param qtdRubr Valor para atribuir ao campo qtdRubr
       * @return O próprio DetVerbas para continuar populando outros campos
       */
      public DetVerbas<T> setQtdRubr(Double qtdRubr) {
        this.qtdRubr = qtdRubr;
        return this;
      }

      /**
       * Informar o fator, percentual, etc. da rubrica, quando necessário. Ex.: Adicional de horas
       * extras 50%, relacionado a uma rubrica de horas extras: Fator = 50.
       *
       * @return Conteúdo do campo fatorRubr
       */
      public Double getFatorRubr() {
        return this.fatorRubr;
      }

      /**
       * Informar o fator, percentual, etc. da rubrica, quando necessário. Ex.: Adicional de horas
       * extras 50%, relacionado a uma rubrica de horas extras: Fator = 50.
       *
       * <p>Validação: Deve ser maior que 0 (zero).
       *
       * @param fatorRubr Valor para atribuir ao campo fatorRubr
       * @return O próprio DetVerbas para continuar populando outros campos
       */
      public DetVerbas<T> setFatorRubr(Double fatorRubr) {
        this.fatorRubr = fatorRubr;
        return this;
      }

      /**
       * Valor total da rubrica.
       *
       * @return Conteúdo do campo vrRubr
       */
      public Double getVrRubr() {
        return this.vrRubr;
      }

      /**
       * Valor total da rubrica.
       *
       * <p>Validação: Deve ser maior que 0 (zero).
       *
       * @param vrRubr Valor para atribuir ao campo vrRubr
       * @return O próprio DetVerbas para continuar populando outros campos
       */
      public DetVerbas<T> setVrRubr(Double vrRubr) {
        this.vrRubr = vrRubr;
        return this;
      }

      /**
       * Indicativo de tipo de apuração de IR.
       *
       * @return Conteúdo do campo indApurIR
       */
      public String getIndApurIR() {
        return this.indApurIR;
      }

      /**
       * Indicativo de tipo de apuração de IR.
       *
       * <p>Validação: Informação obrigatória e exclusiva se mês/ano de
       * {dtDeslig}(2299_infoDeslig_dtDeslig) >= [2021-05].
       *
       * @param indApurIR Valor para atribuir ao campo indApurIR
       * @return O próprio DetVerbas para continuar populando outros campos
       */
      public DetVerbas<T> setIndApurIR(String indApurIR) {
        if (!"0".equals(indApurIR) && !"1".equals(indApurIR))
          throw new RuntimeException(
              "Valor " + String.valueOf(indApurIR) + " inválido para o campo indApurIR");
        this.indApurIR = indApurIR;
        return this;
      }
      /**
       * Normal (apuração sob a folha de pagamento declarada no eSocial)
       *
       * @return O próprio DetVerbas para continuar populando outros campos
       */
      public DetVerbas<T> setIndApurIR_0() {
        this.indApurIR = "0";
        return this;
      }
      /**
       * Situação especial de apuração de IR
       *
       * @return O próprio DetVerbas para continuar populando outros campos
       */
      public DetVerbas<T> setIndApurIR_1() {
        this.indApurIR = "1";
        return this;
      }

      public DetVerbas(Object pai) {
        this.pai = pai;
      }

      @XmlTransient private final Object pai;

      /**
       * Finaliza a população dos campos filhos desse nível
       *
       * @return O nível anterior da árvore
       */
      public T finish() {
        return (T) pai;
      }
    }

    /**
     * Grau de exposição a agentes nocivos
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "grauExp",
        })
    public static class InfoAgNocivo<T> {

      /**
       * Preencher com o código que representa o grau de exposição a agentes nocivos, conforme
       * Tabela 02.
       */
      private String grauExp;

      /**
       * Preencher com o código que representa o grau de exposição a agentes nocivos, conforme
       * Tabela 02.
       *
       * @return Conteúdo do campo grauExp
       */
      public String getGrauExp() {
        return this.grauExp;
      }

      /**
       * Preencher com o código que representa o grau de exposição a agentes nocivos, conforme
       * Tabela 02.
       *
       * @param grauExp Valor para atribuir ao campo grauExp
       * @return O próprio InfoAgNocivo para continuar populando outros campos
       */
      public InfoAgNocivo<T> setGrauExp(String grauExp) {
        if (!"1".equals(grauExp)
            && !"2".equals(grauExp)
            && !"3".equals(grauExp)
            && !"4".equals(grauExp))
          throw new RuntimeException(
              "Valor " + String.valueOf(grauExp) + " inválido para o campo grauExp");
        this.grauExp = grauExp;
        return this;
      }
      /**
       * Não ensejador de aposentadoria especial
       *
       * @return O próprio InfoAgNocivo para continuar populando outros campos
       */
      public InfoAgNocivo<T> setGrauExp_1() {
        this.grauExp = "1";
        return this;
      }
      /**
       * Ensejador de aposentadoria especial - FAE15_12% (15 anos de contribuição e alíquota de 12%)
       *
       * @return O próprio InfoAgNocivo para continuar populando outros campos
       */
      public InfoAgNocivo<T> setGrauExp_2() {
        this.grauExp = "2";
        return this;
      }
      /**
       * Ensejador de aposentadoria especial - FAE20_09% (20 anos de contribuição e alíquota de 9%)
       *
       * @return O próprio InfoAgNocivo para continuar populando outros campos
       */
      public InfoAgNocivo<T> setGrauExp_3() {
        this.grauExp = "3";
        return this;
      }
      /**
       * Ensejador de aposentadoria especial - FAE25_06% (25 anos de contribuição e alíquota de 6%)
       *
       * @return O próprio InfoAgNocivo para continuar populando outros campos
       */
      public InfoAgNocivo<T> setGrauExp_4() {
        this.grauExp = "4";
        return this;
      }

      public InfoAgNocivo(Object pai) {
        this.pai = pai;
      }

      @XmlTransient private final Object pai;

      /**
       * Finaliza a população dos campos filhos desse nível
       *
       * @return O nível anterior da árvore
       */
      public T finish() {
        return (T) pai;
      }
    }
  }
}
