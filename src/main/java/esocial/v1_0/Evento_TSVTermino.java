package esocial.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlTransient;

/** S-2399 - Trabalhador Sem Vínculo de Emprego/Estatutário - Término */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "",
    propOrder = {
      "evtTSVTermino",
    })
@XmlRootElement(name = "eSocial")
public class Evento_TSVTermino {

  /** Evento TSVE - Término */
  private EvtTSVTermino evtTSVTermino;

  /**
   * Evento TSVE - Término
   *
   * @return Conteúdo do campo evtTSVTermino
   */
  public EvtTSVTermino getEvtTSVTermino() {
    return this.evtTSVTermino;
  }

  /**
   * Evento TSVE - Término
   *
   * <p>DESCRICAO_COMPLETA:Evento Trabalhador Sem Vínculo de Emprego/Estatutário - Término.
   *
   * <p>CHAVE_GRUPO: {Id}
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
   * <p>REGRA:REGRA_TSV_ATIVO_NA_DTEVENTO
   *
   * <p>REGRA:REGRA_VALIDA_EMPREGADOR
   *
   * <p>REGRA:REGRA_VALIDA_PERIODO_APURACAO
   *
   * @return O objeto EvtTSVTermino para população dos campos filhos
   */
  public EvtTSVTermino<Evento_TSVTermino> setEvtTSVTermino() {
    if (this.evtTSVTermino == null) {
      this.evtTSVTermino = new EvtTSVTermino(this);
    }
    return this.evtTSVTermino;
  }

  /**
   * Evento TSVE - Término
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "ideEvento",
        "ideEmpregador",
        "ideTrabSemVinculo",
        "infoTSVTermino",
      })
  public static class EvtTSVTermino<T> {

    /** Informações de identificação do evento. */
    private Tipos.T_ideEvento_trab_indGuia ideEvento;

    /** Informações de identificação do empregador. */
    private Tipos.T_ideEmpregador ideEmpregador;

    /** Identificação do TSVE */
    private Tipos.T_ideTrabSemVinculo ideTrabSemVinculo;

    /** TSVE - Término. */
    private InfoTSVTermino infoTSVTermino;

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
    public Tipos.T_ideEvento_trab_indGuia<EvtTSVTermino<T>> setIdeEvento() {
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
    public Tipos.T_ideEmpregador<EvtTSVTermino<T>> setIdeEmpregador() {
      if (this.ideEmpregador == null) {
        this.ideEmpregador = new Tipos.T_ideEmpregador(this);
      }
      return this.ideEmpregador;
    }

    /**
     * Identificação do TSVE
     *
     * @return Conteúdo do campo ideTrabSemVinculo
     */
    public Tipos.T_ideTrabSemVinculo getIdeTrabSemVinculo() {
      return this.ideTrabSemVinculo;
    }

    /**
     * Identificação do TSVE
     *
     * <p>DESCRICAO_COMPLETA:Identificação do Trabalhador Sem Vínculo de Emprego/Estatutário - TSVE.
     *
     * <p>CHAVE_GRUPO: {cpfTrab}, {matricula}, {codCateg}
     *
     * @return O objeto Tipos.T_ideTrabSemVinculo para população dos campos filhos
     */
    public Tipos.T_ideTrabSemVinculo<EvtTSVTermino<T>> setIdeTrabSemVinculo() {
      if (this.ideTrabSemVinculo == null) {
        this.ideTrabSemVinculo = new Tipos.T_ideTrabSemVinculo(this);
      }
      return this.ideTrabSemVinculo;
    }

    /**
     * TSVE - Término.
     *
     * @return Conteúdo do campo infoTSVTermino
     */
    public InfoTSVTermino getInfoTSVTermino() {
      return this.infoTSVTermino;
    }

    /**
     * TSVE - Término.
     *
     * @return O objeto InfoTSVTermino para população dos campos filhos
     */
    public InfoTSVTermino<EvtTSVTermino<T>> setInfoTSVTermino() {
      if (this.infoTSVTermino == null) {
        this.infoTSVTermino = new InfoTSVTermino(this);
      }
      return this.infoTSVTermino;
    }

    public EvtTSVTermino(Object pai) {
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
     * TSVE - Término.
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "dtTerm",
          "mtvDesligTSV",
          "pensAlim",
          "percAliment",
          "vrAlim",
          "nrProcTrab",
          "mudancaCPF",
          "verbasResc",
          "quarentena",
        })
    public static class InfoTSVTermino<T> {

      /** Data do término. */
      private javax.xml.datatype.XMLGregorianCalendar dtTerm;

      /** Motivo do término. */
      private String mtvDesligTSV;

      /** Indicativo de pensão alimentícia para fins de retenção de FGTS. */
      private String pensAlim;

      /** Percentual a ser destinado a pensão alimentícia. */
      private Double percAliment;

      /** Valor da pensão alimentícia. */
      private Double vrAlim;

      /**
       * Número que identifica o processo trabalhista, quando o término de TSVE se der por decisão
       * judicial.
       */
      private String nrProcTrab;

      /** Informação do novo CPF do trabalhador. */
      private MudancaCPF mudancaCPF;

      /** Verbas rescisórias */
      private VerbasResc verbasResc;

      /**
       * Informações sobre a quarentena remunerada ou outra situação de término com data anterior
       */
      private Quarentena quarentena;

      /**
       * Data do término.
       *
       * @return Conteúdo do campo dtTerm
       */
      public javax.xml.datatype.XMLGregorianCalendar getDtTerm() {
        return this.dtTerm;
      }

      /**
       * Data do término.
       *
       * <p>Validação: Deve ser uma data igual ou anterior à data atual acrescida de 10 (dez) dias.
       *
       * @param dtTerm Valor para atribuir ao campo dtTerm
       * @return O próprio InfoTSVTermino para continuar populando outros campos
       */
      public InfoTSVTermino<T> setDtTerm(javax.xml.datatype.XMLGregorianCalendar dtTerm) {
        this.dtTerm = dtTerm;
        return this;
      }

      /**
       * Motivo do término.
       *
       * @return Conteúdo do campo mtvDesligTSV
       */
      public String getMtvDesligTSV() {
        return this.mtvDesligTSV;
      }

      /**
       * Motivo do término.
       *
       * <p>Validação: Informação obrigatória se o código de categoria no Registro de Eventos
       * Trabalhistas - RET for igual a [721] ou se o grupo
       * {mudancaCPF}(2399_infoTSVTermino_mudancaCPF) estiver preenchido. Não preencher nas demais
       * situações.
       *
       * @param mtvDesligTSV Valor para atribuir ao campo mtvDesligTSV
       * @return O próprio InfoTSVTermino para continuar populando outros campos
       */
      public InfoTSVTermino<T> setMtvDesligTSV(String mtvDesligTSV) {
        if (!"01".equals(mtvDesligTSV)
            && !"02".equals(mtvDesligTSV)
            && !"03".equals(mtvDesligTSV)
            && !"04".equals(mtvDesligTSV)
            && !"05".equals(mtvDesligTSV)
            && !"06".equals(mtvDesligTSV)
            && !"07".equals(mtvDesligTSV)
            && !"99".equals(mtvDesligTSV))
          throw new RuntimeException(
              "Valor " + String.valueOf(mtvDesligTSV) + " inválido para o campo mtvDesligTSV");
        this.mtvDesligTSV = mtvDesligTSV;
        return this;
      }
      /**
       * Exoneração do diretor não empregado sem justa causa, por deliberação da assembleia, dos
       * sócios cotistas ou da autoridade competente
       *
       * @return O próprio InfoTSVTermino para continuar populando outros campos
       */
      public InfoTSVTermino<T> setMtvDesligTSV_01() {
        this.mtvDesligTSV = "01";
        return this;
      }
      /**
       * Término de mandato do diretor não empregado que não tenha sido reconduzido ao cargo
       *
       * @return O próprio InfoTSVTermino para continuar populando outros campos
       */
      public InfoTSVTermino<T> setMtvDesligTSV_02() {
        this.mtvDesligTSV = "02";
        return this;
      }
      /**
       * Exoneração a pedido de diretor não empregado
       *
       * @return O próprio InfoTSVTermino para continuar populando outros campos
       */
      public InfoTSVTermino<T> setMtvDesligTSV_03() {
        this.mtvDesligTSV = "03";
        return this;
      }
      /**
       * Exoneração do diretor não empregado por culpa recíproca ou força maior
       *
       * @return O próprio InfoTSVTermino para continuar populando outros campos
       */
      public InfoTSVTermino<T> setMtvDesligTSV_04() {
        this.mtvDesligTSV = "04";
        return this;
      }
      /**
       * Morte do diretor não empregado
       *
       * @return O próprio InfoTSVTermino para continuar populando outros campos
       */
      public InfoTSVTermino<T> setMtvDesligTSV_05() {
        this.mtvDesligTSV = "05";
        return this;
      }
      /**
       * Exoneração do diretor não empregado por falência, encerramento ou supressão de parte da
       * empresa
       *
       * @return O próprio InfoTSVTermino para continuar populando outros campos
       */
      public InfoTSVTermino<T> setMtvDesligTSV_06() {
        this.mtvDesligTSV = "06";
        return this;
      }
      /**
       * Mudança de CPF
       *
       * @return O próprio InfoTSVTermino para continuar populando outros campos
       */
      public InfoTSVTermino<T> setMtvDesligTSV_07() {
        this.mtvDesligTSV = "07";
        return this;
      }
      /**
       * Outros
       *
       * @return O próprio InfoTSVTermino para continuar populando outros campos
       */
      public InfoTSVTermino<T> setMtvDesligTSV_99() {
        this.mtvDesligTSV = "99";
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
       * <p>Validação: Informação obrigatória se o código de categoria no RET for igual a [201, 202,
       * 721] e se {dtTerm}(./dtTerm) for posterior a 21/04/2019.
       *
       * <p>Informação opcional se o código de categoria no RET for igual a [201, 202, 721] e se
       * {dtTerm}(./dtTerm) for igual ou anterior a 21/04/2019.
       *
       * <p>Não preencher nas demais situações.
       *
       * @param pensAlim Valor para atribuir ao campo pensAlim
       * @return O próprio InfoTSVTermino para continuar populando outros campos
       */
      public InfoTSVTermino<T> setPensAlim(String pensAlim) {
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
       * @return O próprio InfoTSVTermino para continuar populando outros campos
       */
      public InfoTSVTermino<T> setPensAlim_0() {
        this.pensAlim = "0";
        return this;
      }
      /**
       * Percentual de pensão alimentícia
       *
       * @return O próprio InfoTSVTermino para continuar populando outros campos
       */
      public InfoTSVTermino<T> setPensAlim_1() {
        this.pensAlim = "1";
        return this;
      }
      /**
       * Valor de pensão alimentícia
       *
       * @return O próprio InfoTSVTermino para continuar populando outros campos
       */
      public InfoTSVTermino<T> setPensAlim_2() {
        this.pensAlim = "2";
        return this;
      }
      /**
       * Percentual e valor de pensão alimentícia
       *
       * @return O próprio InfoTSVTermino para continuar populando outros campos
       */
      public InfoTSVTermino<T> setPensAlim_3() {
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
       * @return O próprio InfoTSVTermino para continuar populando outros campos
       */
      public InfoTSVTermino<T> setPercAliment(Double percAliment) {
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
       * @return O próprio InfoTSVTermino para continuar populando outros campos
       */
      public InfoTSVTermino<T> setVrAlim(Double vrAlim) {
        this.vrAlim = vrAlim;
        return this;
      }

      /**
       * Número que identifica o processo trabalhista, quando o término de TSVE se der por decisão
       * judicial.
       *
       * @return Conteúdo do campo nrProcTrab
       */
      public String getNrProcTrab() {
        return this.nrProcTrab;
      }

      /**
       * Número que identifica o processo trabalhista, quando o término de TSVE se der por decisão
       * judicial.
       *
       * <p>Validação: Se preenchido, deve ser um processo judicial válido, com 20 (vinte)
       * algarismos.
       *
       * @param nrProcTrab Valor para atribuir ao campo nrProcTrab
       * @return O próprio InfoTSVTermino para continuar populando outros campos
       */
      public InfoTSVTermino<T> setNrProcTrab(String nrProcTrab) {
        this.nrProcTrab = nrProcTrab;
        return this;
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
       * <p>CONDICAO_GRUPO: O (se {mtvDesligTSV}(2399_infoTSVTermino_mtvDesligTSV) = [07]); N (nos
       * demais casos)
       *
       * @return O objeto MudancaCPF para população dos campos filhos
       */
      public MudancaCPF<InfoTSVTermino<T>> setMudancaCPF() {
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
       * <p>DESCRICAO_COMPLETA:Grupo onde são prestadas as informações relativas às verbas
       * rescisórias do diretor não empregado, com FGTS.
       *
       * <p>CONDICAO_GRUPO: N (se {mtvDesligTSV}(2399_infoTSVTermino_mtvDesligTSV) = [07] OU
       * {dtTerm}(2399_infoTSVTermino_dtTerm) for anterior ao início de obrigatoriedade dos eventos
       * periódicos para o empregador OU o código de categoria no RET for diferente de [721]); OC
       * (nos demais casos)
       *
       * @return O objeto VerbasResc para população dos campos filhos
       */
      public VerbasResc<InfoTSVTermino<T>> setVerbasResc() {
        if (this.verbasResc == null) {
          this.verbasResc = new VerbasResc(this);
        }
        return this.verbasResc;
      }

      /**
       * Informações sobre a quarentena remunerada ou outra situação de término com data anterior
       *
       * @return Conteúdo do campo quarentena
       */
      public Quarentena getQuarentena() {
        return this.quarentena;
      }

      /**
       * Informações sobre a quarentena remunerada ou outra situação de término com data anterior
       *
       * <p>DESCRICAO_COMPLETA:Informações sobre a "quarentena" remunerada de trabalhador desligado
       * ou outra situação de término com data anterior.
       *
       * <p>O grupo deve ser preenchido apenas no caso do trabalhador que recebe remuneração após o
       * desligamento por estar impossibilitado de exercer atividade remunerada ou no caso de
       * término reconhecido judicialmente com data anterior a competências com remunerações já
       * informadas no eSocial.
       *
       * <p>CONDICAO_GRUPO: OC
       *
       * @return O objeto Quarentena para população dos campos filhos
       */
      public Quarentena<InfoTSVTermino<T>> setQuarentena() {
        if (this.quarentena == null) {
          this.quarentena = new Quarentena(this);
        }
        return this.quarentena;
      }

      public InfoTSVTermino(Object pai) {
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
              "ideEstabLot",
            })
        public static class DmDev<T> {

          /**
           * Identificador atribuído pela empresa para o demonstrativo de valores devidos ao
           * trabalhador relativo a verbas rescisórias.
           */
          private String ideDmDev;

          /**
           * Identificação do estabelecimento e lotação
           *
           * <p>- Esse campo pode ser repetido até 99 vezes
           */
          private java.util.List<IdeEstabLot> ideEstabLot;

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
           * data de término) para cada um dos demonstrativos do trabalhador.
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
           * Identificação do estabelecimento e lotação
           *
           * @return Conteúdo do campo ideEstabLot
           */
          public java.util.List<IdeEstabLot> getIdeEstabLot() {
            return this.ideEstabLot;
          }

          /**
           * Identificação do estabelecimento e lotação
           *
           * <p>- Esse campo pode ser repetido até 99 vezes
           *
           * <p>DESCRICAO_COMPLETA:Identificação do estabelecimento e da lotação nos quais o
           * trabalhador possui remuneração no período de apuração.
           *
           * <p>CHAVE_GRUPO: {tpInsc}, {nrInsc}, {codLotacao}
           *
           * @return O objeto IdeEstabLot para população dos campos filhos
           */
          public IdeEstabLot<DmDev<T>> setIdeEstabLot_Next() {
            if (this.ideEstabLot == null) {
              this.ideEstabLot = new java.util.ArrayList<>();
            }
            IdeEstabLot toAdd = new IdeEstabLot(this);
            this.ideEstabLot.add(toAdd);
            return toAdd;
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
                "infoSimples",
              })
          public static class IdeEstabLot<T> {

            /**
             * Preencher com o código correspondente ao tipo de inscrição do estabelecimento, de
             * acordo com as opções da Tabela 05.
             */
            private String tpInsc;

            /**
             * Informar o número de inscrição do estabelecimento do contribuinte de acordo com o
             * tipo de inscrição indicado no campo {ideEstabLot/tpInsc}(./tpInsc).
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

            /** Informação relativa a empresas do Simples */
            private Tipos.T_infoSimples infoSimples;

            /**
             * Preencher com o código correspondente ao tipo de inscrição do estabelecimento, de
             * acordo com as opções da Tabela 05.
             *
             * @return Conteúdo do campo tpInsc
             */
            public String getTpInsc() {
              return this.tpInsc;
            }

            /**
             * Preencher com o código correspondente ao tipo de inscrição do estabelecimento, de
             * acordo com as opções da Tabela 05.
             *
             * @param tpInsc Valor para atribuir ao campo tpInsc
             * @return O próprio IdeEstabLot para continuar populando outros campos
             */
            public IdeEstabLot<T> setTpInsc(String tpInsc) {
              if (!"1".equals(tpInsc) && !"4".equals(tpInsc))
                throw new RuntimeException(
                    "Valor " + String.valueOf(tpInsc) + " inválido para o campo tpInsc");
              this.tpInsc = tpInsc;
              return this;
            }
            /**
             * CNPJ
             *
             * @return O próprio IdeEstabLot para continuar populando outros campos
             */
            public IdeEstabLot<T> setTpInsc_1() {
              this.tpInsc = "1";
              return this;
            }
            /**
             * CNO
             *
             * @return O próprio IdeEstabLot para continuar populando outros campos
             */
            public IdeEstabLot<T> setTpInsc_4() {
              this.tpInsc = "4";
              return this;
            }

            /**
             * Informar o número de inscrição do estabelecimento do contribuinte de acordo com o
             * tipo de inscrição indicado no campo {ideEstabLot/tpInsc}(./tpInsc).
             *
             * @return Conteúdo do campo nrInsc
             */
            public String getNrInsc() {
              return this.nrInsc;
            }

            /**
             * Informar o número de inscrição do estabelecimento do contribuinte de acordo com o
             * tipo de inscrição indicado no campo {ideEstabLot/tpInsc}(./tpInsc).
             *
             * <p>Validação: A inscrição informada deve ser compatível com
             * {ideEstabLot/tpInsc}(./tpInsc).
             *
             * @param nrInsc Valor para atribuir ao campo nrInsc
             * @return O próprio IdeEstabLot para continuar populando outros campos
             */
            public IdeEstabLot<T> setNrInsc(String nrInsc) {
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
             * @return O próprio IdeEstabLot para continuar populando outros campos
             */
            public IdeEstabLot<T> setCodLotacao(String codLotacao) {
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
             * <p>DESCRICAO_COMPLETA:Detalhamento das verbas rescisórias devidas ao trabalhador.
             * Deve haver pelo menos uma rubrica de folha, mesmo que o valor líquido a ser pago ao
             * trabalhador seja 0 (zero) em função de descontos.
             *
             * @return O objeto DetVerbas para população dos campos filhos
             */
            public DetVerbas<IdeEstabLot<T>> setDetVerbas_Next() {
              if (this.detVerbas == null) {
                this.detVerbas = new java.util.ArrayList<>();
              }
              DetVerbas toAdd = new DetVerbas(this);
              this.detVerbas.add(toAdd);
              return toAdd;
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
             * <p>DESCRICAO_COMPLETA:Informação relativa a empresas enquadradas no regime de
             * tributação Simples Nacional.
             *
             * <p>CONDICAO_GRUPO: O (se
             * {classTrib}(1000_infoEmpregador_inclusao_infoCadastro_classTrib) em S-1000 = [03]); N
             * (nos demais casos)
             *
             * @return O objeto Tipos.T_infoSimples para população dos campos filhos
             */
            public Tipos.T_infoSimples<IdeEstabLot<T>> setInfoSimples() {
              if (this.infoSimples == null) {
                this.infoSimples = new Tipos.T_infoSimples(this);
              }
              return this.infoSimples;
            }

            public IdeEstabLot(Object pai) {
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
               * Informar o código atribuído pelo empregador que identifica a rubrica em sua folha
               * de pagamento ou o código da rubrica constante da Tabela de Rubricas Padrão.
               */
              private String codRubr;

              /**
               * Preencher com o identificador da Tabela de Rubricas para a rubrica definida em
               * {codRubr}(./codRubr).
               */
              private String ideTabRubr;

              /**
               * Informar a quantidade de referência para apuração (em horas, cotas, meses, etc.).
               * Ex.: Quantidade de horas extras trabalhadas relacionada com uma rubrica de hora
               * extra, quantidade de dias trabalhados relacionada com uma rubrica de salário, etc.
               */
              private Double qtdRubr;

              /**
               * Informar o fator, percentual, etc. da rubrica, quando necessário. Ex.: Adicional de
               * horas extras 50%, relacionado a uma rubrica de horas extras: Fator = 50.
               */
              private Double fatorRubr;

              /** Valor total da rubrica. */
              private Double vrRubr;

              /** Indicativo de tipo de apuração de IR. */
              private String indApurIR;

              /**
               * Informar o código atribuído pelo empregador que identifica a rubrica em sua folha
               * de pagamento ou o código da rubrica constante da Tabela de Rubricas Padrão.
               *
               * @return Conteúdo do campo codRubr
               */
              public String getCodRubr() {
                return this.codRubr;
              }

              /**
               * Informar o código atribuído pelo empregador que identifica a rubrica em sua folha
               * de pagamento ou o código da rubrica constante da Tabela de Rubricas Padrão.
               *
               * <p>Validação: Não pode ser utilizada rubrica:
               *
               * <p>a) cujo {codIncCP}(1010_infoRubrica_inclusao_dadosRubrica_codIncCP) em S-1010
               * seja igual a [25, 26, 51];
               *
               * <p>b) cuja {natRubr}(1010_infoRubrica_inclusao_dadosRubrica_natRubr) em S-1010 seja
               * igual a [1801, 9209, 9210, 9220], desde que mês/ano de
               * {dtTerm}(2399_infoTSVTermino_dtTerm) >= [2021-05].
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
               * Informar a quantidade de referência para apuração (em horas, cotas, meses, etc.).
               * Ex.: Quantidade de horas extras trabalhadas relacionada com uma rubrica de hora
               * extra, quantidade de dias trabalhados relacionada com uma rubrica de salário, etc.
               *
               * @return Conteúdo do campo qtdRubr
               */
              public Double getQtdRubr() {
                return this.qtdRubr;
              }

              /**
               * Informar a quantidade de referência para apuração (em horas, cotas, meses, etc.).
               * Ex.: Quantidade de horas extras trabalhadas relacionada com uma rubrica de hora
               * extra, quantidade de dias trabalhados relacionada com uma rubrica de salário, etc.
               *
               * <p>Preenchimento obrigatório quando se tratar de rubrica relativa a faltas ou
               * Descanso Semanal Remunerado - DSR sobre faltas (nesse caso, informar a quantidade
               * de dias).
               *
               * <p>Validação: Deve ser maior que 0 (zero). Informação obrigatória se
               * {codRubr}(./codRubr) tiver
               * {natRubr}(1010_infoRubrica_inclusao_dadosRubrica_natRubr) em S-1010 igual a [9207,
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
               * Informar o fator, percentual, etc. da rubrica, quando necessário. Ex.: Adicional de
               * horas extras 50%, relacionado a uma rubrica de horas extras: Fator = 50.
               *
               * @return Conteúdo do campo fatorRubr
               */
              public Double getFatorRubr() {
                return this.fatorRubr;
              }

              /**
               * Informar o fator, percentual, etc. da rubrica, quando necessário. Ex.: Adicional de
               * horas extras 50%, relacionado a uma rubrica de horas extras: Fator = 50.
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
               * {dtTerm}(2399_infoTSVTermino_dtTerm) >= [2021-05].
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
          }
        }
      }

      /**
       * Informações sobre a quarentena remunerada ou outra situação de término com data anterior
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
         * término reconhecido judicialmente com data anterior a competências com remunerações já
         * informadas no eSocial, informar o último dia trabalhado.
         */
        private javax.xml.datatype.XMLGregorianCalendar dtFimQuar;

        /**
         * Preencher com a data final da quarentena a que está sujeito o trabalhador. No caso de
         * término reconhecido judicialmente com data anterior a competências com remunerações já
         * informadas no eSocial, informar o último dia trabalhado.
         *
         * @return Conteúdo do campo dtFimQuar
         */
        public javax.xml.datatype.XMLGregorianCalendar getDtFimQuar() {
          return this.dtFimQuar;
        }

        /**
         * Preencher com a data final da quarentena a que está sujeito o trabalhador. No caso de
         * término reconhecido judicialmente com data anterior a competências com remunerações já
         * informadas no eSocial, informar o último dia trabalhado.
         *
         * <p>Validação: Deve ser uma data posterior a {dtTerm}(2399_infoTSVTermino_dtTerm).
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
    }
  }
}
