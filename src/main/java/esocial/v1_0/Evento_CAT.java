package esocial.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlTransient;

/** S-2210 - Comunicação de Acidente de Trabalho */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "",
    propOrder = {
      "evtCAT",
    })
@XmlRootElement(name = "eSocial")
public class Evento_CAT {

  /** Evento Comunicação de Acidente de Trabalho. */
  private EvtCAT evtCAT;

  /**
   * Evento Comunicação de Acidente de Trabalho.
   *
   * @return Conteúdo do campo evtCAT
   */
  public EvtCAT getEvtCAT() {
    return this.evtCAT;
  }

  /**
   * Evento Comunicação de Acidente de Trabalho.
   *
   * <p>CHAVE_GRUPO: {Id}
   *
   * <p>REGRA:REGRA_EMPREGADO_DOMESTICO
   *
   * <p>REGRA:REGRA_ENVIO_PROC_FECHAMENTO
   *
   * <p>REGRA:REGRA_EVENTOS_EXTEMP
   *
   * <p>REGRA:REGRA_EVENTO_EXT_SEM_IMPACTO_FOPAG
   *
   * <p>REGRA:REGRA_EVENTO_POSTERIOR_CAT_OBITO
   *
   * <p>REGRA:REGRA_EXCLUI_EVENTO_CAT
   *
   * <p>REGRA:REGRA_EXISTE_CAT_ORIGEM
   *
   * <p>REGRA:REGRA_EXISTE_INFO_EMPREGADOR
   *
   * <p>REGRA:REGRA_EXTEMP_REINTEGRACAO
   *
   * <p>REGRA:REGRA_GERAL_VALIDA_DADOS_TABCONTRIB
   *
   * <p>REGRA:REGRA_MESMO_PROCEMI
   *
   * <p>REGRA:REGRA_RETIFICA_DT_ACIDENTE
   *
   * <p>REGRA:REGRA_RETIFICA_MESMO_VINCULO
   *
   * <p>REGRA:REGRA_TSV_ATIVO_NA_DTEVENTO
   *
   * <p>REGRA:REGRA_VINCULO_ATIVO_NA_DTEVENTO
   *
   * @return O objeto EvtCAT para população dos campos filhos
   */
  public EvtCAT<Evento_CAT> setEvtCAT() {
    if (this.evtCAT == null) {
      this.evtCAT = new EvtCAT(this);
    }
    return this.evtCAT;
  }

  /**
   * Evento Comunicação de Acidente de Trabalho.
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
        "cat",
      })
  public static class EvtCAT<T> {

    /** Informações de identificação do evento. */
    private Tipos.T_ideEvento_trab ideEvento;

    /** Informações de identificação do empregador. */
    private Tipos.T_ideEmpregador ideEmpregador;

    /** Informações de identificação do trabalhador e do vínculo. */
    private Tipos.T_ideVinculo_sst ideVinculo;

    /** CAT */
    private Cat cat;

    /**
     * Informações de identificação do evento.
     *
     * @return Conteúdo do campo ideEvento
     */
    public Tipos.T_ideEvento_trab getIdeEvento() {
      return this.ideEvento;
    }

    /**
     * Informações de identificação do evento.
     *
     * @return O objeto Tipos.T_ideEvento_trab para população dos campos filhos
     */
    public Tipos.T_ideEvento_trab<EvtCAT<T>> setIdeEvento() {
      if (this.ideEvento == null) {
        this.ideEvento = new Tipos.T_ideEvento_trab(this);
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
    public Tipos.T_ideEmpregador<EvtCAT<T>> setIdeEmpregador() {
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
    public Tipos.T_ideVinculo_sst getIdeVinculo() {
      return this.ideVinculo;
    }

    /**
     * Informações de identificação do trabalhador e do vínculo.
     *
     * <p>CHAVE_GRUPO: {cpfTrab}, {matricula}, {codCateg}
     *
     * @return O objeto Tipos.T_ideVinculo_sst para população dos campos filhos
     */
    public Tipos.T_ideVinculo_sst<EvtCAT<T>> setIdeVinculo() {
      if (this.ideVinculo == null) {
        this.ideVinculo = new Tipos.T_ideVinculo_sst(this);
      }
      return this.ideVinculo;
    }

    /**
     * CAT
     *
     * @return Conteúdo do campo cat
     */
    public Cat getCat() {
      return this.cat;
    }

    /**
     * CAT
     *
     * <p>DESCRICAO_COMPLETA:Comunicação de Acidente de Trabalho - CAT.
     *
     * <p>CHAVE_GRUPO: {dtAcid}, {hrAcid}, {tpCat}
     *
     * @return O objeto Cat para população dos campos filhos
     */
    public Cat<EvtCAT<T>> setCat() {
      if (this.cat == null) {
        this.cat = new Cat(this);
      }
      return this.cat;
    }

    public EvtCAT(Object pai) {
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
     * CAT
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "dtAcid",
          "tpAcid",
          "hrAcid",
          "hrsTrabAntesAcid",
          "tpCat",
          "indCatObito",
          "dtObito",
          "indComunPolicia",
          "codSitGeradora",
          "iniciatCAT",
          "obsCAT",
          "localAcidente",
          "parteAtingida",
          "agenteCausador",
          "atestado",
          "catOrigem",
        })
    public static class Cat<T> {

      /** Data do acidente. */
      private javax.xml.datatype.XMLGregorianCalendar dtAcid;

      /** Tipo de acidente de trabalho. */
      private String tpAcid;

      /** Hora do acidente, no formato HHMM. */
      private Integer hrAcid;

      /** Horas trabalhadas antes da ocorrência do acidente, no formato HHMM. */
      private Integer hrsTrabAntesAcid;

      /** Tipo de CAT. */
      private String tpCat;

      /** Houve óbito? */
      private String indCatObito;

      /** Data do óbito. */
      private javax.xml.datatype.XMLGregorianCalendar dtObito;

      /** Houve comunicação à autoridade policial? */
      private String indComunPolicia;

      /** Preencher com o código da situação geradora do acidente ou da doença profissional. */
      private Integer codSitGeradora;

      /** Iniciativa da CAT. */
      private String iniciatCAT;

      /** Observação. */
      private String obsCAT;

      /** Local do acidente. */
      private LocalAcidente localAcidente;

      /** Parte do corpo atingida. */
      private ParteAtingida parteAtingida;

      /** Agente causador. */
      private AgenteCausador agenteCausador;

      /** Atestado médico. */
      private Atestado atestado;

      /** CAT de origem */
      private CatOrigem catOrigem;

      /**
       * Data do acidente.
       *
       * @return Conteúdo do campo dtAcid
       */
      public javax.xml.datatype.XMLGregorianCalendar getDtAcid() {
        return this.dtAcid;
      }

      /**
       * Data do acidente.
       *
       * <p>Validação: Deve ser uma data válida, igual ou anterior à data atual e igual ou posterior
       * à data de admissão do trabalhador e à data de início da obrigatoriedade deste evento para o
       * empregador no eSocial.
       *
       * <p>Se {tpCat}(./tpCat) = [2, 3], deve ser informado valor igual ao preenchido no evento de
       * CAT anterior, quando informado em {nrRecCatOrig}(./catOrigem_nrRecCatOrig).
       *
       * @param dtAcid Valor para atribuir ao campo dtAcid
       * @return O próprio Cat para continuar populando outros campos
       */
      public Cat<T> setDtAcid(javax.xml.datatype.XMLGregorianCalendar dtAcid) {
        this.dtAcid = dtAcid;
        return this;
      }

      /**
       * Tipo de acidente de trabalho.
       *
       * @return Conteúdo do campo tpAcid
       */
      public String getTpAcid() {
        return this.tpAcid;
      }

      /**
       * Tipo de acidente de trabalho.
       *
       * @param tpAcid Valor para atribuir ao campo tpAcid
       * @return O próprio Cat para continuar populando outros campos
       */
      public Cat<T> setTpAcid(String tpAcid) {
        if (!"1".equals(tpAcid) && !"2".equals(tpAcid) && !"3".equals(tpAcid))
          throw new RuntimeException(
              "Valor " + String.valueOf(tpAcid) + " inválido para o campo tpAcid");
        this.tpAcid = tpAcid;
        return this;
      }
      /**
       * Típico
       *
       * @return O próprio Cat para continuar populando outros campos
       */
      public Cat<T> setTpAcid_1() {
        this.tpAcid = "1";
        return this;
      }
      /**
       * Doença
       *
       * @return O próprio Cat para continuar populando outros campos
       */
      public Cat<T> setTpAcid_2() {
        this.tpAcid = "2";
        return this;
      }
      /**
       * Trajeto
       *
       * @return O próprio Cat para continuar populando outros campos
       */
      public Cat<T> setTpAcid_3() {
        this.tpAcid = "3";
        return this;
      }

      /**
       * Hora do acidente, no formato HHMM.
       *
       * @return Conteúdo do campo hrAcid
       */
      public Integer getHrAcid() {
        return this.hrAcid;
      }

      /**
       * Hora do acidente, no formato HHMM.
       *
       * <p>Validação: Preenchimento obrigatório e exclusivo se {tpAcid}(./tpAcid) = [1]. Se
       * informada, deve estar no intervalo entre [0000] e [2359], criticando inclusive a segunda
       * parte do número, que indica os minutos, que deve ser menor ou igual a 59.
       *
       * <p>Se {tpCat}(./tpCat) = [2, 3], deve ser informado valor igual ao preenchido no evento de
       * CAT anterior, quando informado em {nrRecCatOrig}(./catOrigem_nrRecCatOrig).
       *
       * @param hrAcid Valor para atribuir ao campo hrAcid
       * @return O próprio Cat para continuar populando outros campos
       */
      public Cat<T> setHrAcid(Integer hrAcid) {
        this.hrAcid = hrAcid;
        return this;
      }

      /**
       * Horas trabalhadas antes da ocorrência do acidente, no formato HHMM.
       *
       * @return Conteúdo do campo hrsTrabAntesAcid
       */
      public Integer getHrsTrabAntesAcid() {
        return this.hrsTrabAntesAcid;
      }

      /**
       * Horas trabalhadas antes da ocorrência do acidente, no formato HHMM.
       *
       * <p>Validação: Preenchimento obrigatório e exclusivo se {tpAcid}(./tpAcid) = [1]. Se
       * informada, deve estar no intervalo entre [0000] e [9959], criticando inclusive a segunda
       * parte do número, que indica os minutos, que deve ser menor ou igual a 59.
       *
       * @param hrsTrabAntesAcid Valor para atribuir ao campo hrsTrabAntesAcid
       * @return O próprio Cat para continuar populando outros campos
       */
      public Cat<T> setHrsTrabAntesAcid(Integer hrsTrabAntesAcid) {
        this.hrsTrabAntesAcid = hrsTrabAntesAcid;
        return this;
      }

      /**
       * Tipo de CAT.
       *
       * @return Conteúdo do campo tpCat
       */
      public String getTpCat() {
        return this.tpCat;
      }

      /**
       * Tipo de CAT.
       *
       * @param tpCat Valor para atribuir ao campo tpCat
       * @return O próprio Cat para continuar populando outros campos
       */
      public Cat<T> setTpCat(String tpCat) {
        if (!"1".equals(tpCat) && !"2".equals(tpCat) && !"3".equals(tpCat))
          throw new RuntimeException(
              "Valor " + String.valueOf(tpCat) + " inválido para o campo tpCat");
        this.tpCat = tpCat;
        return this;
      }
      /**
       * Inicial
       *
       * @return O próprio Cat para continuar populando outros campos
       */
      public Cat<T> setTpCat_1() {
        this.tpCat = "1";
        return this;
      }
      /**
       * Reabertura
       *
       * @return O próprio Cat para continuar populando outros campos
       */
      public Cat<T> setTpCat_2() {
        this.tpCat = "2";
        return this;
      }
      /**
       * Comunicação de óbito
       *
       * @return O próprio Cat para continuar populando outros campos
       */
      public Cat<T> setTpCat_3() {
        this.tpCat = "3";
        return this;
      }

      /**
       * Houve óbito?
       *
       * @return Conteúdo do campo indCatObito
       */
      public String getIndCatObito() {
        return this.indCatObito;
      }

      /**
       * Houve óbito?
       *
       * <p>Validação: Se o {tpCat}(./tpCat) for igual a [3], o campo deverá sempre ser preenchido
       * com [S]. Se o {tpCat}(./tpCat) for igual a [2], o campo deverá sempre ser preenchido com
       * [N].
       *
       * @param indCatObito Valor para atribuir ao campo indCatObito
       * @return O próprio Cat para continuar populando outros campos
       */
      public Cat<T> setIndCatObito(String indCatObito) {
        if (!"S".equals(indCatObito) && !"N".equals(indCatObito))
          throw new RuntimeException(
              "Valor " + String.valueOf(indCatObito) + " inválido para o campo indCatObito");
        this.indCatObito = indCatObito;
        return this;
      }
      /**
       * Sim
       *
       * @return O próprio Cat para continuar populando outros campos
       */
      public Cat<T> setIndCatObito_S() {
        this.indCatObito = "S";
        return this;
      }
      /**
       * Não
       *
       * @return O próprio Cat para continuar populando outros campos
       */
      public Cat<T> setIndCatObito_N() {
        this.indCatObito = "N";
        return this;
      }

      /**
       * Data do óbito.
       *
       * @return Conteúdo do campo dtObito
       */
      public javax.xml.datatype.XMLGregorianCalendar getDtObito() {
        return this.dtObito;
      }

      /**
       * Data do óbito.
       *
       * <p>Validação: Deve ser uma data válida, igual ou posterior a {dtAcid}(./dtAcid) e igual ou
       * anterior à data atual.
       *
       * <p>Preenchimento obrigatório e exclusivo se {indCatObito}(./indCatObito) = [S].
       *
       * @param dtObito Valor para atribuir ao campo dtObito
       * @return O próprio Cat para continuar populando outros campos
       */
      public Cat<T> setDtObito(javax.xml.datatype.XMLGregorianCalendar dtObito) {
        this.dtObito = dtObito;
        return this;
      }

      /**
       * Houve comunicação à autoridade policial?
       *
       * @return Conteúdo do campo indComunPolicia
       */
      public String getIndComunPolicia() {
        return this.indComunPolicia;
      }

      /**
       * Houve comunicação à autoridade policial?
       *
       * @param indComunPolicia Valor para atribuir ao campo indComunPolicia
       * @return O próprio Cat para continuar populando outros campos
       */
      public Cat<T> setIndComunPolicia(String indComunPolicia) {
        if (!"S".equals(indComunPolicia) && !"N".equals(indComunPolicia))
          throw new RuntimeException(
              "Valor "
                  + String.valueOf(indComunPolicia)
                  + " inválido para o campo indComunPolicia");
        this.indComunPolicia = indComunPolicia;
        return this;
      }
      /**
       * Sim
       *
       * @return O próprio Cat para continuar populando outros campos
       */
      public Cat<T> setIndComunPolicia_S() {
        this.indComunPolicia = "S";
        return this;
      }
      /**
       * Não
       *
       * @return O próprio Cat para continuar populando outros campos
       */
      public Cat<T> setIndComunPolicia_N() {
        this.indComunPolicia = "N";
        return this;
      }

      /**
       * Preencher com o código da situação geradora do acidente ou da doença profissional.
       *
       * @return Conteúdo do campo codSitGeradora
       */
      public Integer getCodSitGeradora() {
        return this.codSitGeradora;
      }

      /**
       * Preencher com o código da situação geradora do acidente ou da doença profissional.
       *
       * <p>Validação: Deve ser um código válido e existente na Tabela 15 ou na Tabela 16.
       *
       * @param codSitGeradora Valor para atribuir ao campo codSitGeradora
       * @return O próprio Cat para continuar populando outros campos
       */
      public Cat<T> setCodSitGeradora(Integer codSitGeradora) {
        this.codSitGeradora = codSitGeradora;
        return this;
      }

      /**
       * Iniciativa da CAT.
       *
       * @return Conteúdo do campo iniciatCAT
       */
      public String getIniciatCAT() {
        return this.iniciatCAT;
      }

      /**
       * Iniciativa da CAT.
       *
       * @param iniciatCAT Valor para atribuir ao campo iniciatCAT
       * @return O próprio Cat para continuar populando outros campos
       */
      public Cat<T> setIniciatCAT(String iniciatCAT) {
        if (!"1".equals(iniciatCAT) && !"2".equals(iniciatCAT) && !"3".equals(iniciatCAT))
          throw new RuntimeException(
              "Valor " + String.valueOf(iniciatCAT) + " inválido para o campo iniciatCAT");
        this.iniciatCAT = iniciatCAT;
        return this;
      }
      /**
       * Empregador
       *
       * @return O próprio Cat para continuar populando outros campos
       */
      public Cat<T> setIniciatCAT_1() {
        this.iniciatCAT = "1";
        return this;
      }
      /**
       * Ordem judicial
       *
       * @return O próprio Cat para continuar populando outros campos
       */
      public Cat<T> setIniciatCAT_2() {
        this.iniciatCAT = "2";
        return this;
      }
      /**
       * Determinação de órgão fiscalizador
       *
       * @return O próprio Cat para continuar populando outros campos
       */
      public Cat<T> setIniciatCAT_3() {
        this.iniciatCAT = "3";
        return this;
      }

      /**
       * Observação.
       *
       * @return Conteúdo do campo obsCAT
       */
      public String getObsCAT() {
        return this.obsCAT;
      }

      /**
       * Observação.
       *
       * @param obsCAT Valor para atribuir ao campo obsCAT
       * @return O próprio Cat para continuar populando outros campos
       */
      public Cat<T> setObsCAT(String obsCAT) {
        this.obsCAT = obsCAT;
        return this;
      }

      /**
       * Local do acidente.
       *
       * @return Conteúdo do campo localAcidente
       */
      public LocalAcidente getLocalAcidente() {
        return this.localAcidente;
      }

      /**
       * Local do acidente.
       *
       * @return O objeto LocalAcidente para população dos campos filhos
       */
      public LocalAcidente<Cat<T>> setLocalAcidente() {
        if (this.localAcidente == null) {
          this.localAcidente = new LocalAcidente(this);
        }
        return this.localAcidente;
      }

      /**
       * Parte do corpo atingida.
       *
       * @return Conteúdo do campo parteAtingida
       */
      public ParteAtingida getParteAtingida() {
        return this.parteAtingida;
      }

      /**
       * Parte do corpo atingida.
       *
       * <p>DESCRICAO_COMPLETA:Detalhamento da parte atingida pelo acidente de trabalho.
       *
       * @return O objeto ParteAtingida para população dos campos filhos
       */
      public ParteAtingida<Cat<T>> setParteAtingida() {
        if (this.parteAtingida == null) {
          this.parteAtingida = new ParteAtingida(this);
        }
        return this.parteAtingida;
      }

      /**
       * Agente causador.
       *
       * @return Conteúdo do campo agenteCausador
       */
      public AgenteCausador getAgenteCausador() {
        return this.agenteCausador;
      }

      /**
       * Agente causador.
       *
       * <p>DESCRICAO_COMPLETA:Detalhamento do agente causador do acidente de trabalho.
       *
       * @return O objeto AgenteCausador para população dos campos filhos
       */
      public AgenteCausador<Cat<T>> setAgenteCausador() {
        if (this.agenteCausador == null) {
          this.agenteCausador = new AgenteCausador(this);
        }
        return this.agenteCausador;
      }

      /**
       * Atestado médico.
       *
       * @return Conteúdo do campo atestado
       */
      public Atestado getAtestado() {
        return this.atestado;
      }

      /**
       * Atestado médico.
       *
       * <p>CONDICAO_GRUPO: OC
       *
       * @return O objeto Atestado para população dos campos filhos
       */
      public Atestado<Cat<T>> setAtestado() {
        if (this.atestado == null) {
          this.atestado = new Atestado(this);
        }
        return this.atestado;
      }

      /**
       * CAT de origem
       *
       * @return Conteúdo do campo catOrigem
       */
      public CatOrigem getCatOrigem() {
        return this.catOrigem;
      }

      /**
       * CAT de origem
       *
       * <p>DESCRICAO_COMPLETA:Grupo que indica a CAT anterior, no caso de CAT de reabertura ou de
       * comunicação de óbito.
       *
       * <p>CHAVE_GRUPO: {nrRecCatOrig}
       *
       * <p>CONDICAO_GRUPO: O (se {tpCat}(../tpCat) for igual a [2, 3]); N (nos demais casos)
       *
       * @return O objeto CatOrigem para população dos campos filhos
       */
      public CatOrigem<Cat<T>> setCatOrigem() {
        if (this.catOrigem == null) {
          this.catOrigem = new CatOrigem(this);
        }
        return this.catOrigem;
      }

      public Cat(Object pai) {
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
       * Local do acidente.
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "tpLocal",
            "dscLocal",
            "tpLograd",
            "dscLograd",
            "nrLograd",
            "complemento",
            "bairro",
            "cep",
            "codMunic",
            "uf",
            "pais",
            "codPostal",
            "ideLocalAcid",
          })
      public static class LocalAcidente<T> {

        /** Tipo de local do acidente. */
        private String tpLocal;

        /** Especificação do local do acidente (pátio, rampa de acesso, posto de trabalho, etc.). */
        private String dscLocal;

        /** Tipo de logradouro. */
        private String tpLograd;

        /** Descrição do logradouro. */
        private String dscLograd;

        /** Número do logradouro. */
        private String nrLograd;

        /** Complemento do logradouro. */
        private String complemento;

        /** Nome do bairro/distrito. */
        private String bairro;

        /** Código de Endereçamento Postal - CEP. */
        private String cep;

        /** Preencher com o código do município, conforme tabela do IBGE. */
        private Integer codMunic;

        /** Preencher com a sigla da Unidade da Federação - UF. */
        private String uf;

        /** Preencher com o código do país. */
        private String pais;

        /** Código de Endereçamento Postal. */
        private String codPostal;

        /** Identificação do local onde ocorreu o acidente. */
        private IdeLocalAcid ideLocalAcid;

        /**
         * Tipo de local do acidente.
         *
         * @return Conteúdo do campo tpLocal
         */
        public String getTpLocal() {
          return this.tpLocal;
        }

        /**
         * Tipo de local do acidente.
         *
         * @param tpLocal Valor para atribuir ao campo tpLocal
         * @return O próprio LocalAcidente para continuar populando outros campos
         */
        public LocalAcidente<T> setTpLocal(String tpLocal) {
          if (!"1".equals(tpLocal)
              && !"2".equals(tpLocal)
              && !"3".equals(tpLocal)
              && !"4".equals(tpLocal)
              && !"5".equals(tpLocal)
              && !"6".equals(tpLocal)
              && !"9".equals(tpLocal))
            throw new RuntimeException(
                "Valor " + String.valueOf(tpLocal) + " inválido para o campo tpLocal");
          this.tpLocal = tpLocal;
          return this;
        }
        /**
         * Estabelecimento do empregador no Brasil
         *
         * @return O próprio LocalAcidente para continuar populando outros campos
         */
        public LocalAcidente<T> setTpLocal_1() {
          this.tpLocal = "1";
          return this;
        }
        /**
         * Estabelecimento do empregador no exterior
         *
         * @return O próprio LocalAcidente para continuar populando outros campos
         */
        public LocalAcidente<T> setTpLocal_2() {
          this.tpLocal = "2";
          return this;
        }
        /**
         * Estabelecimento de terceiros onde o empregador presta serviços
         *
         * @return O próprio LocalAcidente para continuar populando outros campos
         */
        public LocalAcidente<T> setTpLocal_3() {
          this.tpLocal = "3";
          return this;
        }
        /**
         * Via pública
         *
         * @return O próprio LocalAcidente para continuar populando outros campos
         */
        public LocalAcidente<T> setTpLocal_4() {
          this.tpLocal = "4";
          return this;
        }
        /**
         * Área rural
         *
         * @return O próprio LocalAcidente para continuar populando outros campos
         */
        public LocalAcidente<T> setTpLocal_5() {
          this.tpLocal = "5";
          return this;
        }
        /**
         * Embarcação
         *
         * @return O próprio LocalAcidente para continuar populando outros campos
         */
        public LocalAcidente<T> setTpLocal_6() {
          this.tpLocal = "6";
          return this;
        }
        /**
         * Outros
         *
         * @return O próprio LocalAcidente para continuar populando outros campos
         */
        public LocalAcidente<T> setTpLocal_9() {
          this.tpLocal = "9";
          return this;
        }

        /**
         * Especificação do local do acidente (pátio, rampa de acesso, posto de trabalho, etc.).
         *
         * @return Conteúdo do campo dscLocal
         */
        public String getDscLocal() {
          return this.dscLocal;
        }

        /**
         * Especificação do local do acidente (pátio, rampa de acesso, posto de trabalho, etc.).
         *
         * @param dscLocal Valor para atribuir ao campo dscLocal
         * @return O próprio LocalAcidente para continuar populando outros campos
         */
        public LocalAcidente<T> setDscLocal(String dscLocal) {
          this.dscLocal = dscLocal;
          return this;
        }

        /**
         * Tipo de logradouro.
         *
         * @return Conteúdo do campo tpLograd
         */
        public String getTpLograd() {
          return this.tpLograd;
        }

        /**
         * Tipo de logradouro.
         *
         * <p>Validação: Se informado, deve ser um código válido e existente na Tabela 20.
         *
         * @param tpLograd Valor para atribuir ao campo tpLograd
         * @return O próprio LocalAcidente para continuar populando outros campos
         */
        public LocalAcidente<T> setTpLograd(String tpLograd) {
          this.tpLograd = tpLograd;
          return this;
        }

        /**
         * Descrição do logradouro.
         *
         * @return Conteúdo do campo dscLograd
         */
        public String getDscLograd() {
          return this.dscLograd;
        }

        /**
         * Descrição do logradouro.
         *
         * @param dscLograd Valor para atribuir ao campo dscLograd
         * @return O próprio LocalAcidente para continuar populando outros campos
         */
        public LocalAcidente<T> setDscLograd(String dscLograd) {
          this.dscLograd = dscLograd;
          return this;
        }

        /**
         * Número do logradouro.
         *
         * @return Conteúdo do campo nrLograd
         */
        public String getNrLograd() {
          return this.nrLograd;
        }

        /**
         * Número do logradouro.
         *
         * <p>Se não houver número a ser informado, preencher com "S/N".
         *
         * @param nrLograd Valor para atribuir ao campo nrLograd
         * @return O próprio LocalAcidente para continuar populando outros campos
         */
        public LocalAcidente<T> setNrLograd(String nrLograd) {
          this.nrLograd = nrLograd;
          return this;
        }

        /**
         * Complemento do logradouro.
         *
         * @return Conteúdo do campo complemento
         */
        public String getComplemento() {
          return this.complemento;
        }

        /**
         * Complemento do logradouro.
         *
         * @param complemento Valor para atribuir ao campo complemento
         * @return O próprio LocalAcidente para continuar populando outros campos
         */
        public LocalAcidente<T> setComplemento(String complemento) {
          this.complemento = complemento;
          return this;
        }

        /**
         * Nome do bairro/distrito.
         *
         * @return Conteúdo do campo bairro
         */
        public String getBairro() {
          return this.bairro;
        }

        /**
         * Nome do bairro/distrito.
         *
         * @param bairro Valor para atribuir ao campo bairro
         * @return O próprio LocalAcidente para continuar populando outros campos
         */
        public LocalAcidente<T> setBairro(String bairro) {
          this.bairro = bairro;
          return this;
        }

        /**
         * Código de Endereçamento Postal - CEP.
         *
         * @return Conteúdo do campo cep
         */
        public String getCep() {
          return this.cep;
        }

        /**
         * Código de Endereçamento Postal - CEP.
         *
         * <p>Validação: Preenchimento obrigatório se {tpLocal}(./tpLocal) = [1, 3, 5]. Não
         * preencher se {tpLocal}(./tpLocal) = [2].
         *
         * <p>Se preenchido, deve ser informado apenas com números, com 8 (oito) posições.
         *
         * @param cep Valor para atribuir ao campo cep
         * @return O próprio LocalAcidente para continuar populando outros campos
         */
        public LocalAcidente<T> setCep(String cep) {
          this.cep = cep;
          return this;
        }

        /**
         * Preencher com o código do município, conforme tabela do IBGE.
         *
         * @return Conteúdo do campo codMunic
         */
        public Integer getCodMunic() {
          return this.codMunic;
        }

        /**
         * Preencher com o código do município, conforme tabela do IBGE.
         *
         * <p>Validação: Preenchimento obrigatório se {tpLocal}(./tpLocal) = [1, 3, 4, 5]. Não
         * preencher se {tpLocal}(./tpLocal) = [2].
         *
         * <p>Se informado, deve ser um código válido e existente na tabela do IBGE.
         *
         * @param codMunic Valor para atribuir ao campo codMunic
         * @return O próprio LocalAcidente para continuar populando outros campos
         */
        public LocalAcidente<T> setCodMunic(Integer codMunic) {
          this.codMunic = codMunic;
          return this;
        }

        /**
         * Preencher com a sigla da Unidade da Federação - UF.
         *
         * @return Conteúdo do campo uf
         */
        public String getUf() {
          return this.uf;
        }

        /**
         * Preencher com a sigla da Unidade da Federação - UF.
         *
         * <p>Validação: Preenchimento obrigatório se {tpLocal}(./tpLocal) = [1, 3, 4, 5]. Não
         * preencher se {tpLocal}(./tpLocal) = [2].
         *
         * @param uf Valor para atribuir ao campo uf
         * @return O próprio LocalAcidente para continuar populando outros campos
         */
        public LocalAcidente<T> setUf(String uf) {
          if (!"AC".equals(uf)
              && !"AL".equals(uf)
              && !"AP".equals(uf)
              && !"AM".equals(uf)
              && !"BA".equals(uf)
              && !"CE".equals(uf)
              && !"DF".equals(uf)
              && !"ES".equals(uf)
              && !"GO".equals(uf)
              && !"MA".equals(uf)
              && !"MT".equals(uf)
              && !"MS".equals(uf)
              && !"MG".equals(uf)
              && !"PA".equals(uf)
              && !"PB".equals(uf)
              && !"PR".equals(uf)
              && !"PE".equals(uf)
              && !"PI".equals(uf)
              && !"RJ".equals(uf)
              && !"RN".equals(uf)
              && !"RS".equals(uf)
              && !"RO".equals(uf)
              && !"RR".equals(uf)
              && !"SC".equals(uf)
              && !"SP".equals(uf)
              && !"SE".equals(uf)
              && !"TO".equals(uf))
            throw new RuntimeException("Valor " + String.valueOf(uf) + " inválido para o campo uf");
          this.uf = uf;
          return this;
        }

        public LocalAcidente<T> setUf_AC() {
          this.uf = "AC";
          return this;
        }

        public LocalAcidente<T> setUf_AL() {
          this.uf = "AL";
          return this;
        }

        public LocalAcidente<T> setUf_AP() {
          this.uf = "AP";
          return this;
        }

        public LocalAcidente<T> setUf_AM() {
          this.uf = "AM";
          return this;
        }

        public LocalAcidente<T> setUf_BA() {
          this.uf = "BA";
          return this;
        }

        public LocalAcidente<T> setUf_CE() {
          this.uf = "CE";
          return this;
        }

        public LocalAcidente<T> setUf_DF() {
          this.uf = "DF";
          return this;
        }

        public LocalAcidente<T> setUf_ES() {
          this.uf = "ES";
          return this;
        }

        public LocalAcidente<T> setUf_GO() {
          this.uf = "GO";
          return this;
        }

        public LocalAcidente<T> setUf_MA() {
          this.uf = "MA";
          return this;
        }

        public LocalAcidente<T> setUf_MT() {
          this.uf = "MT";
          return this;
        }

        public LocalAcidente<T> setUf_MS() {
          this.uf = "MS";
          return this;
        }

        public LocalAcidente<T> setUf_MG() {
          this.uf = "MG";
          return this;
        }

        public LocalAcidente<T> setUf_PA() {
          this.uf = "PA";
          return this;
        }

        public LocalAcidente<T> setUf_PB() {
          this.uf = "PB";
          return this;
        }

        public LocalAcidente<T> setUf_PR() {
          this.uf = "PR";
          return this;
        }

        public LocalAcidente<T> setUf_PE() {
          this.uf = "PE";
          return this;
        }

        public LocalAcidente<T> setUf_PI() {
          this.uf = "PI";
          return this;
        }

        public LocalAcidente<T> setUf_RJ() {
          this.uf = "RJ";
          return this;
        }

        public LocalAcidente<T> setUf_RN() {
          this.uf = "RN";
          return this;
        }

        public LocalAcidente<T> setUf_RS() {
          this.uf = "RS";
          return this;
        }

        public LocalAcidente<T> setUf_RO() {
          this.uf = "RO";
          return this;
        }

        public LocalAcidente<T> setUf_RR() {
          this.uf = "RR";
          return this;
        }

        public LocalAcidente<T> setUf_SC() {
          this.uf = "SC";
          return this;
        }

        public LocalAcidente<T> setUf_SP() {
          this.uf = "SP";
          return this;
        }

        public LocalAcidente<T> setUf_SE() {
          this.uf = "SE";
          return this;
        }

        public LocalAcidente<T> setUf_TO() {
          this.uf = "TO";
          return this;
        }

        /**
         * Preencher com o código do país.
         *
         * @return Conteúdo do campo pais
         */
        public String getPais() {
          return this.pais;
        }

        /**
         * Preencher com o código do país.
         *
         * <p>Validação: Deve ser um código de país válido e existente na Tabela 06.
         *
         * <p>Preenchimento obrigatório se {tpLocal}(./tpLocal) = [2]. Não preencher nos demais
         * casos.
         *
         * @param pais Valor para atribuir ao campo pais
         * @return O próprio LocalAcidente para continuar populando outros campos
         */
        public LocalAcidente<T> setPais(String pais) {
          this.pais = pais;
          return this;
        }

        /**
         * Código de Endereçamento Postal.
         *
         * @return Conteúdo do campo codPostal
         */
        public String getCodPostal() {
          return this.codPostal;
        }

        /**
         * Código de Endereçamento Postal.
         *
         * <p>Validação: Preenchimento obrigatório se {tpLocal}(./tpLocal) = [2]. Não preencher nos
         * demais casos.
         *
         * @param codPostal Valor para atribuir ao campo codPostal
         * @return O próprio LocalAcidente para continuar populando outros campos
         */
        public LocalAcidente<T> setCodPostal(String codPostal) {
          this.codPostal = codPostal;
          return this;
        }

        /**
         * Identificação do local onde ocorreu o acidente.
         *
         * @return Conteúdo do campo ideLocalAcid
         */
        public IdeLocalAcid getIdeLocalAcid() {
          return this.ideLocalAcid;
        }

        /**
         * Identificação do local onde ocorreu o acidente.
         *
         * <p>CONDICAO_GRUPO: O (se {ideEmpregador/tpInsc}(2210_ideEmpregador_tpInsc) = [1] e
         * {tpLocal}(../tpLocal) = [1, 3]); OC (nos demais casos)
         *
         * @return O objeto IdeLocalAcid para população dos campos filhos
         */
        public IdeLocalAcid<LocalAcidente<T>> setIdeLocalAcid() {
          if (this.ideLocalAcid == null) {
            this.ideLocalAcid = new IdeLocalAcid(this);
          }
          return this.ideLocalAcid;
        }

        public LocalAcidente(Object pai) {
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
         * Identificação do local onde ocorreu o acidente.
         *
         * @param <T> Tipo do retorno do método finish()
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(
            name = "",
            propOrder = {
              "tpInsc", "nrInsc",
            })
        public static class IdeLocalAcid<T> {

          /**
           * Preencher com o código correspondente ao tipo de inscrição do local onde ocorreu o
           * acidente ou a doença ocupacional, conforme Tabela 05.
           */
          private String tpInsc;

          /**
           * Informar o número de inscrição do estabelecimento, de acordo com o tipo de inscrição
           * indicado no campo {ideLocalAcid/tpInsc}(./tpInsc). Se o acidente ou a doença
           * ocupacional ocorreu em local onde o trabalhador presta serviços, deve ser um número de
           * inscrição pertencente à contratante dos serviços.
           */
          private String nrInsc;

          /**
           * Preencher com o código correspondente ao tipo de inscrição do local onde ocorreu o
           * acidente ou a doença ocupacional, conforme Tabela 05.
           *
           * @return Conteúdo do campo tpInsc
           */
          public String getTpInsc() {
            return this.tpInsc;
          }

          /**
           * Preencher com o código correspondente ao tipo de inscrição do local onde ocorreu o
           * acidente ou a doença ocupacional, conforme Tabela 05.
           *
           * @param tpInsc Valor para atribuir ao campo tpInsc
           * @return O próprio IdeLocalAcid para continuar populando outros campos
           */
          public IdeLocalAcid<T> setTpInsc(String tpInsc) {
            if (!"1".equals(tpInsc) && !"3".equals(tpInsc) && !"4".equals(tpInsc))
              throw new RuntimeException(
                  "Valor " + String.valueOf(tpInsc) + " inválido para o campo tpInsc");
            this.tpInsc = tpInsc;
            return this;
          }
          /**
           * CNPJ
           *
           * @return O próprio IdeLocalAcid para continuar populando outros campos
           */
          public IdeLocalAcid<T> setTpInsc_1() {
            this.tpInsc = "1";
            return this;
          }
          /**
           * CAEPF
           *
           * @return O próprio IdeLocalAcid para continuar populando outros campos
           */
          public IdeLocalAcid<T> setTpInsc_3() {
            this.tpInsc = "3";
            return this;
          }
          /**
           * CNO
           *
           * @return O próprio IdeLocalAcid para continuar populando outros campos
           */
          public IdeLocalAcid<T> setTpInsc_4() {
            this.tpInsc = "4";
            return this;
          }

          /**
           * Informar o número de inscrição do estabelecimento, de acordo com o tipo de inscrição
           * indicado no campo {ideLocalAcid/tpInsc}(./tpInsc). Se o acidente ou a doença
           * ocupacional ocorreu em local onde o trabalhador presta serviços, deve ser um número de
           * inscrição pertencente à contratante dos serviços.
           *
           * @return Conteúdo do campo nrInsc
           */
          public String getNrInsc() {
            return this.nrInsc;
          }

          /**
           * Informar o número de inscrição do estabelecimento, de acordo com o tipo de inscrição
           * indicado no campo {ideLocalAcid/tpInsc}(./tpInsc). Se o acidente ou a doença
           * ocupacional ocorreu em local onde o trabalhador presta serviços, deve ser um número de
           * inscrição pertencente à contratante dos serviços.
           *
           * <p>Validação: Deve ser compatível com o conteúdo do campo
           * {ideLocalAcid/tpInsc}(./tpInsc). Deve ser um identificador válido, constante das bases
           * da RFB, e:
           *
           * <p>a) Se {tpLocal}(../tpLocal) = [1], deve ser válido e existente na Tabela de
           * Estabelecimentos (S-1005);
           *
           * <p>b) Se {tpLocal}(../tpLocal) = [3], deve ser diferente dos estabelecimentos
           * informados na Tabela S-1005 e, se {ideLocalAcid/tpInsc}(./tpInsc) = [1], diferente do
           * CNPJ base indicado em S-1000.
           *
           * @param nrInsc Valor para atribuir ao campo nrInsc
           * @return O próprio IdeLocalAcid para continuar populando outros campos
           */
          public IdeLocalAcid<T> setNrInsc(String nrInsc) {
            this.nrInsc = nrInsc;
            return this;
          }

          public IdeLocalAcid(Object pai) {
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
       * Parte do corpo atingida.
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "codParteAting",
            "lateralidade",
          })
      public static class ParteAtingida<T> {

        /** Preencher com o código correspondente à parte atingida. */
        private Integer codParteAting;

        /** Lateralidade da(s) parte(s) atingida(s). */
        private String lateralidade;

        /**
         * Preencher com o código correspondente à parte atingida.
         *
         * @return Conteúdo do campo codParteAting
         */
        public Integer getCodParteAting() {
          return this.codParteAting;
        }

        /**
         * Preencher com o código correspondente à parte atingida.
         *
         * <p>Validação: Deve ser um código válido e existente na Tabela 13.
         *
         * @param codParteAting Valor para atribuir ao campo codParteAting
         * @return O próprio ParteAtingida para continuar populando outros campos
         */
        public ParteAtingida<T> setCodParteAting(Integer codParteAting) {
          this.codParteAting = codParteAting;
          return this;
        }

        /**
         * Lateralidade da(s) parte(s) atingida(s).
         *
         * @return Conteúdo do campo lateralidade
         */
        public String getLateralidade() {
          return this.lateralidade;
        }

        /**
         * Lateralidade da(s) parte(s) atingida(s).
         *
         * <p>Nos casos de órgãos bilaterais, ou seja, que se situam dos lados do corpo, assinalar o
         * lado (direito ou esquerdo). Ex.: Caso o órgão atingido seja perna, apontar qual foi a
         * atingida (perna direita, perna esquerda ou ambas). Se o órgão atingido é único (como, por
         * exemplo, a cabeça), assinalar este campo como não aplicável.
         *
         * @param lateralidade Valor para atribuir ao campo lateralidade
         * @return O próprio ParteAtingida para continuar populando outros campos
         */
        public ParteAtingida<T> setLateralidade(String lateralidade) {
          if (!"0".equals(lateralidade)
              && !"1".equals(lateralidade)
              && !"2".equals(lateralidade)
              && !"3".equals(lateralidade))
            throw new RuntimeException(
                "Valor " + String.valueOf(lateralidade) + " inválido para o campo lateralidade");
          this.lateralidade = lateralidade;
          return this;
        }
        /**
         * Não aplicável
         *
         * @return O próprio ParteAtingida para continuar populando outros campos
         */
        public ParteAtingida<T> setLateralidade_0() {
          this.lateralidade = "0";
          return this;
        }
        /**
         * Esquerda
         *
         * @return O próprio ParteAtingida para continuar populando outros campos
         */
        public ParteAtingida<T> setLateralidade_1() {
          this.lateralidade = "1";
          return this;
        }
        /**
         * Direita
         *
         * @return O próprio ParteAtingida para continuar populando outros campos
         */
        public ParteAtingida<T> setLateralidade_2() {
          this.lateralidade = "2";
          return this;
        }
        /**
         * Ambas
         *
         * @return O próprio ParteAtingida para continuar populando outros campos
         */
        public ParteAtingida<T> setLateralidade_3() {
          this.lateralidade = "3";
          return this;
        }

        public ParteAtingida(Object pai) {
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
       * Agente causador.
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "codAgntCausador",
          })
      public static class AgenteCausador<T> {

        /** Preencher com o código correspondente ao agente causador do acidente. */
        private Integer codAgntCausador;

        /**
         * Preencher com o código correspondente ao agente causador do acidente.
         *
         * @return Conteúdo do campo codAgntCausador
         */
        public Integer getCodAgntCausador() {
          return this.codAgntCausador;
        }

        /**
         * Preencher com o código correspondente ao agente causador do acidente.
         *
         * <p>Validação: Deve ser um código válido e existente na Tabela 14 ou na Tabela 15.
         *
         * @param codAgntCausador Valor para atribuir ao campo codAgntCausador
         * @return O próprio AgenteCausador para continuar populando outros campos
         */
        public AgenteCausador<T> setCodAgntCausador(Integer codAgntCausador) {
          this.codAgntCausador = codAgntCausador;
          return this;
        }

        public AgenteCausador(Object pai) {
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
       * Atestado médico.
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "dtAtendimento",
            "hrAtendimento",
            "indInternacao",
            "durTrat",
            "indAfast",
            "dscLesao",
            "dscCompLesao",
            "diagProvavel",
            "codCID",
            "observacao",
            "emitente",
          })
      public static class Atestado<T> {

        /** Data do atendimento. */
        private javax.xml.datatype.XMLGregorianCalendar dtAtendimento;

        /** Hora do atendimento, no formato HHMM. */
        private Integer hrAtendimento;

        /** Indicativo de internação. */
        private String indInternacao;

        /** Duração estimada do tratamento, em dias. */
        private Integer durTrat;

        /** Indicativo de afastamento do trabalho durante o tratamento. */
        private String indAfast;

        /** Preencher com a descrição da natureza da lesão. */
        private Integer dscLesao;

        /** Descrição complementar da lesão. */
        private String dscCompLesao;

        /** Diagnóstico provável. */
        private String diagProvavel;

        /** Informar o código da tabela de Classificação Internacional de Doenças - CID. */
        private String codCID;

        /** Observação. */
        private String observacao;

        /** Médico/Dentista que emitiu o atestado. */
        private Emitente emitente;

        /**
         * Data do atendimento.
         *
         * @return Conteúdo do campo dtAtendimento
         */
        public javax.xml.datatype.XMLGregorianCalendar getDtAtendimento() {
          return this.dtAtendimento;
        }

        /**
         * Data do atendimento.
         *
         * <p>Validação: Deve ser uma data válida, igual ou anterior à data atual.
         *
         * @param dtAtendimento Valor para atribuir ao campo dtAtendimento
         * @return O próprio Atestado para continuar populando outros campos
         */
        public Atestado<T> setDtAtendimento(javax.xml.datatype.XMLGregorianCalendar dtAtendimento) {
          this.dtAtendimento = dtAtendimento;
          return this;
        }

        /**
         * Hora do atendimento, no formato HHMM.
         *
         * @return Conteúdo do campo hrAtendimento
         */
        public Integer getHrAtendimento() {
          return this.hrAtendimento;
        }

        /**
         * Hora do atendimento, no formato HHMM.
         *
         * <p>Validação: Deve estar no intervalo entre [0000] e [2359], criticando inclusive a
         * segunda parte do número, que indica os minutos, que deve ser menor ou igual a 59.
         *
         * @param hrAtendimento Valor para atribuir ao campo hrAtendimento
         * @return O próprio Atestado para continuar populando outros campos
         */
        public Atestado<T> setHrAtendimento(Integer hrAtendimento) {
          this.hrAtendimento = hrAtendimento;
          return this;
        }

        /**
         * Indicativo de internação.
         *
         * @return Conteúdo do campo indInternacao
         */
        public String getIndInternacao() {
          return this.indInternacao;
        }

        /**
         * Indicativo de internação.
         *
         * @param indInternacao Valor para atribuir ao campo indInternacao
         * @return O próprio Atestado para continuar populando outros campos
         */
        public Atestado<T> setIndInternacao(String indInternacao) {
          if (!"S".equals(indInternacao) && !"N".equals(indInternacao))
            throw new RuntimeException(
                "Valor " + String.valueOf(indInternacao) + " inválido para o campo indInternacao");
          this.indInternacao = indInternacao;
          return this;
        }
        /**
         * Sim
         *
         * @return O próprio Atestado para continuar populando outros campos
         */
        public Atestado<T> setIndInternacao_S() {
          this.indInternacao = "S";
          return this;
        }
        /**
         * Não
         *
         * @return O próprio Atestado para continuar populando outros campos
         */
        public Atestado<T> setIndInternacao_N() {
          this.indInternacao = "N";
          return this;
        }

        /**
         * Duração estimada do tratamento, em dias.
         *
         * @return Conteúdo do campo durTrat
         */
        public Integer getDurTrat() {
          return this.durTrat;
        }

        /**
         * Duração estimada do tratamento, em dias.
         *
         * @param durTrat Valor para atribuir ao campo durTrat
         * @return O próprio Atestado para continuar populando outros campos
         */
        public Atestado<T> setDurTrat(Integer durTrat) {
          this.durTrat = durTrat;
          return this;
        }

        /**
         * Indicativo de afastamento do trabalho durante o tratamento.
         *
         * @return Conteúdo do campo indAfast
         */
        public String getIndAfast() {
          return this.indAfast;
        }

        /**
         * Indicativo de afastamento do trabalho durante o tratamento.
         *
         * <p>Validação: Se o campo {indCatObito}(../indCatObito) for igual a [S], o campo deve
         * sempre ser preenchido com [N].
         *
         * @param indAfast Valor para atribuir ao campo indAfast
         * @return O próprio Atestado para continuar populando outros campos
         */
        public Atestado<T> setIndAfast(String indAfast) {
          if (!"S".equals(indAfast) && !"N".equals(indAfast))
            throw new RuntimeException(
                "Valor " + String.valueOf(indAfast) + " inválido para o campo indAfast");
          this.indAfast = indAfast;
          return this;
        }
        /**
         * Sim
         *
         * @return O próprio Atestado para continuar populando outros campos
         */
        public Atestado<T> setIndAfast_S() {
          this.indAfast = "S";
          return this;
        }
        /**
         * Não
         *
         * @return O próprio Atestado para continuar populando outros campos
         */
        public Atestado<T> setIndAfast_N() {
          this.indAfast = "N";
          return this;
        }

        /**
         * Preencher com a descrição da natureza da lesão.
         *
         * @return Conteúdo do campo dscLesao
         */
        public Integer getDscLesao() {
          return this.dscLesao;
        }

        /**
         * Preencher com a descrição da natureza da lesão.
         *
         * <p>Validação: Deve ser um código válido e existente na Tabela 17.
         *
         * @param dscLesao Valor para atribuir ao campo dscLesao
         * @return O próprio Atestado para continuar populando outros campos
         */
        public Atestado<T> setDscLesao(Integer dscLesao) {
          this.dscLesao = dscLesao;
          return this;
        }

        /**
         * Descrição complementar da lesão.
         *
         * @return Conteúdo do campo dscCompLesao
         */
        public String getDscCompLesao() {
          return this.dscCompLesao;
        }

        /**
         * Descrição complementar da lesão.
         *
         * @param dscCompLesao Valor para atribuir ao campo dscCompLesao
         * @return O próprio Atestado para continuar populando outros campos
         */
        public Atestado<T> setDscCompLesao(String dscCompLesao) {
          this.dscCompLesao = dscCompLesao;
          return this;
        }

        /**
         * Diagnóstico provável.
         *
         * @return Conteúdo do campo diagProvavel
         */
        public String getDiagProvavel() {
          return this.diagProvavel;
        }

        /**
         * Diagnóstico provável.
         *
         * @param diagProvavel Valor para atribuir ao campo diagProvavel
         * @return O próprio Atestado para continuar populando outros campos
         */
        public Atestado<T> setDiagProvavel(String diagProvavel) {
          this.diagProvavel = diagProvavel;
          return this;
        }

        /**
         * Informar o código da tabela de Classificação Internacional de Doenças - CID.
         *
         * @return Conteúdo do campo codCID
         */
        public String getCodCID() {
          return this.codCID;
        }

        /**
         * Informar o código da tabela de Classificação Internacional de Doenças - CID.
         *
         * <p>Validação: Deve ser preenchido com caracteres alfanuméricos, conforme opções
         * constantes na tabela CID.
         *
         * @param codCID Valor para atribuir ao campo codCID
         * @return O próprio Atestado para continuar populando outros campos
         */
        public Atestado<T> setCodCID(String codCID) {
          this.codCID = codCID;
          return this;
        }

        /**
         * Observação.
         *
         * @return Conteúdo do campo observacao
         */
        public String getObservacao() {
          return this.observacao;
        }

        /**
         * Observação.
         *
         * @param observacao Valor para atribuir ao campo observacao
         * @return O próprio Atestado para continuar populando outros campos
         */
        public Atestado<T> setObservacao(String observacao) {
          this.observacao = observacao;
          return this;
        }

        /**
         * Médico/Dentista que emitiu o atestado.
         *
         * @return Conteúdo do campo emitente
         */
        public Emitente getEmitente() {
          return this.emitente;
        }

        /**
         * Médico/Dentista que emitiu o atestado.
         *
         * @return O objeto Emitente para população dos campos filhos
         */
        public Emitente<Atestado<T>> setEmitente() {
          if (this.emitente == null) {
            this.emitente = new Emitente(this);
          }
          return this.emitente;
        }

        public Atestado(Object pai) {
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
         * Médico/Dentista que emitiu o atestado.
         *
         * @param <T> Tipo do retorno do método finish()
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(
            name = "",
            propOrder = {
              "nmEmit", "ideOC", "nrOC", "ufOC",
            })
        public static class Emitente<T> {

          /** Nome do médico/dentista que emitiu o atestado. */
          private String nmEmit;

          /** Órgão de classe. */
          private String ideOC;

          /** Número de inscrição no órgão de classe. */
          private String nrOC;

          /** Sigla da UF do órgão de classe. */
          private String ufOC;

          /**
           * Nome do médico/dentista que emitiu o atestado.
           *
           * @return Conteúdo do campo nmEmit
           */
          public String getNmEmit() {
            return this.nmEmit;
          }

          /**
           * Nome do médico/dentista que emitiu o atestado.
           *
           * @param nmEmit Valor para atribuir ao campo nmEmit
           * @return O próprio Emitente para continuar populando outros campos
           */
          public Emitente<T> setNmEmit(String nmEmit) {
            this.nmEmit = nmEmit;
            return this;
          }

          /**
           * Órgão de classe.
           *
           * @return Conteúdo do campo ideOC
           */
          public String getIdeOC() {
            return this.ideOC;
          }

          /**
           * Órgão de classe.
           *
           * @param ideOC Valor para atribuir ao campo ideOC
           * @return O próprio Emitente para continuar populando outros campos
           */
          public Emitente<T> setIdeOC(String ideOC) {
            if (!"1".equals(ideOC) && !"2".equals(ideOC) && !"3".equals(ideOC))
              throw new RuntimeException(
                  "Valor " + String.valueOf(ideOC) + " inválido para o campo ideOC");
            this.ideOC = ideOC;
            return this;
          }
          /**
           * Conselho Regional de Medicina - CRM
           *
           * @return O próprio Emitente para continuar populando outros campos
           */
          public Emitente<T> setIdeOC_1() {
            this.ideOC = "1";
            return this;
          }
          /**
           * Conselho Regional de Odontologia - CRO
           *
           * @return O próprio Emitente para continuar populando outros campos
           */
          public Emitente<T> setIdeOC_2() {
            this.ideOC = "2";
            return this;
          }
          /**
           * Registro do Ministério da Saúde - RMS
           *
           * @return O próprio Emitente para continuar populando outros campos
           */
          public Emitente<T> setIdeOC_3() {
            this.ideOC = "3";
            return this;
          }

          /**
           * Número de inscrição no órgão de classe.
           *
           * @return Conteúdo do campo nrOC
           */
          public String getNrOC() {
            return this.nrOC;
          }

          /**
           * Número de inscrição no órgão de classe.
           *
           * @param nrOC Valor para atribuir ao campo nrOC
           * @return O próprio Emitente para continuar populando outros campos
           */
          public Emitente<T> setNrOC(String nrOC) {
            this.nrOC = nrOC;
            return this;
          }

          /**
           * Sigla da UF do órgão de classe.
           *
           * @return Conteúdo do campo ufOC
           */
          public String getUfOC() {
            return this.ufOC;
          }

          /**
           * Sigla da UF do órgão de classe.
           *
           * @param ufOC Valor para atribuir ao campo ufOC
           * @return O próprio Emitente para continuar populando outros campos
           */
          public Emitente<T> setUfOC(String ufOC) {
            if (!"AC".equals(ufOC)
                && !"AL".equals(ufOC)
                && !"AP".equals(ufOC)
                && !"AM".equals(ufOC)
                && !"BA".equals(ufOC)
                && !"CE".equals(ufOC)
                && !"DF".equals(ufOC)
                && !"ES".equals(ufOC)
                && !"GO".equals(ufOC)
                && !"MA".equals(ufOC)
                && !"MT".equals(ufOC)
                && !"MS".equals(ufOC)
                && !"MG".equals(ufOC)
                && !"PA".equals(ufOC)
                && !"PB".equals(ufOC)
                && !"PR".equals(ufOC)
                && !"PE".equals(ufOC)
                && !"PI".equals(ufOC)
                && !"RJ".equals(ufOC)
                && !"RN".equals(ufOC)
                && !"RS".equals(ufOC)
                && !"RO".equals(ufOC)
                && !"RR".equals(ufOC)
                && !"SC".equals(ufOC)
                && !"SP".equals(ufOC)
                && !"SE".equals(ufOC)
                && !"TO".equals(ufOC))
              throw new RuntimeException(
                  "Valor " + String.valueOf(ufOC) + " inválido para o campo ufOC");
            this.ufOC = ufOC;
            return this;
          }

          public Emitente<T> setUfOC_AC() {
            this.ufOC = "AC";
            return this;
          }

          public Emitente<T> setUfOC_AL() {
            this.ufOC = "AL";
            return this;
          }

          public Emitente<T> setUfOC_AP() {
            this.ufOC = "AP";
            return this;
          }

          public Emitente<T> setUfOC_AM() {
            this.ufOC = "AM";
            return this;
          }

          public Emitente<T> setUfOC_BA() {
            this.ufOC = "BA";
            return this;
          }

          public Emitente<T> setUfOC_CE() {
            this.ufOC = "CE";
            return this;
          }

          public Emitente<T> setUfOC_DF() {
            this.ufOC = "DF";
            return this;
          }

          public Emitente<T> setUfOC_ES() {
            this.ufOC = "ES";
            return this;
          }

          public Emitente<T> setUfOC_GO() {
            this.ufOC = "GO";
            return this;
          }

          public Emitente<T> setUfOC_MA() {
            this.ufOC = "MA";
            return this;
          }

          public Emitente<T> setUfOC_MT() {
            this.ufOC = "MT";
            return this;
          }

          public Emitente<T> setUfOC_MS() {
            this.ufOC = "MS";
            return this;
          }

          public Emitente<T> setUfOC_MG() {
            this.ufOC = "MG";
            return this;
          }

          public Emitente<T> setUfOC_PA() {
            this.ufOC = "PA";
            return this;
          }

          public Emitente<T> setUfOC_PB() {
            this.ufOC = "PB";
            return this;
          }

          public Emitente<T> setUfOC_PR() {
            this.ufOC = "PR";
            return this;
          }

          public Emitente<T> setUfOC_PE() {
            this.ufOC = "PE";
            return this;
          }

          public Emitente<T> setUfOC_PI() {
            this.ufOC = "PI";
            return this;
          }

          public Emitente<T> setUfOC_RJ() {
            this.ufOC = "RJ";
            return this;
          }

          public Emitente<T> setUfOC_RN() {
            this.ufOC = "RN";
            return this;
          }

          public Emitente<T> setUfOC_RS() {
            this.ufOC = "RS";
            return this;
          }

          public Emitente<T> setUfOC_RO() {
            this.ufOC = "RO";
            return this;
          }

          public Emitente<T> setUfOC_RR() {
            this.ufOC = "RR";
            return this;
          }

          public Emitente<T> setUfOC_SC() {
            this.ufOC = "SC";
            return this;
          }

          public Emitente<T> setUfOC_SP() {
            this.ufOC = "SP";
            return this;
          }

          public Emitente<T> setUfOC_SE() {
            this.ufOC = "SE";
            return this;
          }

          public Emitente<T> setUfOC_TO() {
            this.ufOC = "TO";
            return this;
          }

          public Emitente(Object pai) {
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
       * CAT de origem
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "nrRecCatOrig",
          })
      public static class CatOrigem<T> {

        /**
         * Informar o número do recibo da última CAT referente ao mesmo acidente/doença relacionada
         * ao trabalho, nos casos:
         */
        private String nrRecCatOrig;

        /**
         * Informar o número do recibo da última CAT referente ao mesmo acidente/doença relacionada
         * ao trabalho, nos casos:
         *
         * @return Conteúdo do campo nrRecCatOrig
         */
        public String getNrRecCatOrig() {
          return this.nrRecCatOrig;
        }

        /**
         * Informar o número do recibo da última CAT referente ao mesmo acidente/doença relacionada
         * ao trabalho, nos casos:
         *
         * <p>a) de CAT de reabertura;
         *
         * <p>b) de óbito, quando houver CAT anterior.
         *
         * <p>Validação: Deve corresponder ao número do recibo do arquivo relativo à última CAT
         * informada anteriormente, pertencente ao mesmo contrato, desde que
         * {indCatObito}(../indCatObito) da última CAT informada seja igual a [N]. O sistema não
         * efetuará a conferência da informação se {dtAcid}(../dtAcid) for anterior a
         * {sucessaoVinc/dtTransf}(2200_vinculo_sucessaoVinc_dtTransf),
         * {transfDom/dtTransf}(2200_vinculo_transfDom_dtTransf) ou
         * {dtAltCPF}(2200_vinculo_mudancaCPF_dtAltCPF) do evento S-2200.
         *
         * <p>OBS.: Quando a data do acidente for anterior à data de obrigatoriedade do empregador
         * ao envio deste evento, a CAT de reabertura e/ou de óbito não devem ser informadas ao
         * eSocial, mantendo-se o procedimento realizado na emissão da CAT original.
         *
         * @param nrRecCatOrig Valor para atribuir ao campo nrRecCatOrig
         * @return O próprio CatOrigem para continuar populando outros campos
         */
        public CatOrigem<T> setNrRecCatOrig(String nrRecCatOrig) {
          this.nrRecCatOrig = nrRecCatOrig;
          return this;
        }

        public CatOrigem(Object pai) {
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
