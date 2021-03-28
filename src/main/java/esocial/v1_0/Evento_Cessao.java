package esocial.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlTransient;

/** S-2231 - Cessão/Exercício em Outro Órgão */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "",
    propOrder = {
      "evtCessao",
    })
@XmlRootElement(name = "eSocial")
public class Evento_Cessao {

  /** Evento Cessão/Exercício em Outro Órgão. */
  private EvtCessao evtCessao;

  /**
   * Evento Cessão/Exercício em Outro Órgão.
   *
   * @return Conteúdo do campo evtCessao
   */
  public EvtCessao getEvtCessao() {
    return this.evtCessao;
  }

  /**
   * Evento Cessão/Exercício em Outro Órgão.
   *
   * <p>CHAVE_GRUPO: {Id}
   *
   * <p>REGRA:REGRA_ENVIO_PROC_FECHAMENTO
   *
   * <p>REGRA:REGRA_EVENTOS_EXTEMP
   *
   * <p>REGRA:REGRA_EVENTO_EXT_SEM_IMPACTO_FOPAG
   *
   * <p>REGRA:REGRA_EVENTO_IMPACTO_FOPAG
   *
   * <p>REGRA:REGRA_EXCLUI_EVENTO_CESSAO
   *
   * <p>REGRA:REGRA_EXISTE_INFO_EMPREGADOR
   *
   * <p>REGRA:REGRA_EXTEMP_REINTEGRACAO
   *
   * <p>REGRA:REGRA_MESMO_PROCEMI
   *
   * <p>REGRA:REGRA_RETIFICA_MESMO_VINCULO
   *
   * <p>REGRA:REGRA_VINCULO_ATIVO_NA_DTEVENTO
   *
   * @return O objeto EvtCessao para população dos campos filhos
   */
  public EvtCessao<Evento_Cessao> setEvtCessao() {
    if (this.evtCessao == null) {
      this.evtCessao = new EvtCessao(this);
    }
    return this.evtCessao;
  }

  /**
   * Evento Cessão/Exercício em Outro Órgão.
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
        "infoCessao",
      })
  public static class EvtCessao<T> {

    /** Informações de identificação do evento. */
    private Tipos.T_ideEvento_trab ideEvento;

    /** Informações de identificação do empregador. */
    private Tipos.T_ideEmpregador_cnpj ideEmpregador;

    /** Informações de identificação do trabalhador e do vínculo. */
    private Tipos.T_ideVinculo ideVinculo;

    /** Informações da cessão/exercício em outro órgão. */
    private InfoCessao infoCessao;

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
    public Tipos.T_ideEvento_trab<EvtCessao<T>> setIdeEvento() {
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
    public Tipos.T_ideEmpregador_cnpj getIdeEmpregador() {
      return this.ideEmpregador;
    }

    /**
     * Informações de identificação do empregador.
     *
     * <p>CHAVE_GRUPO: {tpInsc}, {nrInsc}
     *
     * @return O objeto Tipos.T_ideEmpregador_cnpj para população dos campos filhos
     */
    public Tipos.T_ideEmpregador_cnpj<EvtCessao<T>> setIdeEmpregador() {
      if (this.ideEmpregador == null) {
        this.ideEmpregador = new Tipos.T_ideEmpregador_cnpj(this);
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
    public Tipos.T_ideVinculo<EvtCessao<T>> setIdeVinculo() {
      if (this.ideVinculo == null) {
        this.ideVinculo = new Tipos.T_ideVinculo(this);
      }
      return this.ideVinculo;
    }

    /**
     * Informações da cessão/exercício em outro órgão.
     *
     * @return Conteúdo do campo infoCessao
     */
    public InfoCessao getInfoCessao() {
      return this.infoCessao;
    }

    /**
     * Informações da cessão/exercício em outro órgão.
     *
     * @return O objeto InfoCessao para população dos campos filhos
     */
    public InfoCessao<EvtCessao<T>> setInfoCessao() {
      if (this.infoCessao == null) {
        this.infoCessao = new InfoCessao(this);
      }
      return this.infoCessao;
    }

    public EvtCessao(Object pai) {
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
     * Informações da cessão/exercício em outro órgão.
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "iniCessao",
          "fimCessao",
        })
    public static class InfoCessao<T> {

      /** Informações de início da cessão/exercício em outro órgão. */
      private IniCessao iniCessao;

      /** Informação de término da cessão/exercício em outro órgão. */
      private FimCessao fimCessao;

      /**
       * Informações de início da cessão/exercício em outro órgão.
       *
       * @return Conteúdo do campo iniCessao
       */
      public IniCessao getIniCessao() {
        return this.iniCessao;
      }

      /**
       * Informações de início da cessão/exercício em outro órgão.
       *
       * <p>CHAVE_GRUPO: {dtIniCessao}
       *
       * <p>CONDICAO_GRUPO: O (se não for preenchido o grupo {fimCessao}(../fimCessao)); N (nos
       * demais casos)
       *
       * @return O objeto IniCessao para população dos campos filhos
       */
      public IniCessao<InfoCessao<T>> setIniCessao() {
        if (this.iniCessao == null) {
          this.iniCessao = new IniCessao(this);
        }
        return this.iniCessao;
      }

      /**
       * Informação de término da cessão/exercício em outro órgão.
       *
       * @return Conteúdo do campo fimCessao
       */
      public FimCessao getFimCessao() {
        return this.fimCessao;
      }

      /**
       * Informação de término da cessão/exercício em outro órgão.
       *
       * <p>CHAVE_GRUPO: {dtTermCessao}
       *
       * <p>CONDICAO_GRUPO: O (se não for preenchido o grupo {iniCessao}(../iniCessao)); N (nos
       * demais casos)
       *
       * <p>REGRA:REGRA_EXISTE_EVENTO_CESSAO
       *
       * @return O objeto FimCessao para população dos campos filhos
       */
      public FimCessao<InfoCessao<T>> setFimCessao() {
        if (this.fimCessao == null) {
          this.fimCessao = new FimCessao(this);
        }
        return this.fimCessao;
      }

      public InfoCessao(Object pai) {
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
       * Informações de início da cessão/exercício em outro órgão.
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "dtIniCessao",
            "cnpjCess",
            "respRemun",
          })
      public static class IniCessao<T> {

        /** Data de início da cessão/exercício em outro órgão. */
        private javax.xml.datatype.XMLGregorianCalendar dtIniCessao;

        /** Preencher com o CNPJ do empregador/órgão público cessionário/de destino. */
        private String cnpjCess;

        /**
         * Informar se o empregador/órgão público declarante continuará informando remunerações
         * (S-1200/S-1202) do trabalhador cedido/em exercício em outro órgão.
         */
        private String respRemun;

        /**
         * Data de início da cessão/exercício em outro órgão.
         *
         * @return Conteúdo do campo dtIniCessao
         */
        public javax.xml.datatype.XMLGregorianCalendar getDtIniCessao() {
          return this.dtIniCessao;
        }

        /**
         * Data de início da cessão/exercício em outro órgão.
         *
         * <p>Validação: Deve-se obedecer às seguintes regras:
         *
         * <p>a) Não pode ser posterior à data atual;
         *
         * <p>b) Não pode existir evento de cessão/exercício em outro órgão (ou evento de
         * afastamento pelo código de motivo de afastamento [14]) com data anterior a
         * {dtIniCessao}(./dtIniCessao) sem que tenha sido encerrado.
         *
         * @param dtIniCessao Valor para atribuir ao campo dtIniCessao
         * @return O próprio IniCessao para continuar populando outros campos
         */
        public IniCessao<T> setDtIniCessao(javax.xml.datatype.XMLGregorianCalendar dtIniCessao) {
          this.dtIniCessao = dtIniCessao;
          return this;
        }

        /**
         * Preencher com o CNPJ do empregador/órgão público cessionário/de destino.
         *
         * @return Conteúdo do campo cnpjCess
         */
        public String getCnpjCess() {
          return this.cnpjCess;
        }

        /**
         * Preencher com o CNPJ do empregador/órgão público cessionário/de destino.
         *
         * <p>Validação: Deve ser um CNPJ diferente do CNPJ do empregador/órgão público e diferente
         * dos estabelecimentos informados através do evento S-1005.
         *
         * <p>REGRA:REGRA_VALIDA_CNPJ
         *
         * @param cnpjCess Valor para atribuir ao campo cnpjCess
         * @return O próprio IniCessao para continuar populando outros campos
         */
        public IniCessao<T> setCnpjCess(String cnpjCess) {
          this.cnpjCess = cnpjCess;
          return this;
        }

        /**
         * Informar se o empregador/órgão público declarante continuará informando remunerações
         * (S-1200/S-1202) do trabalhador cedido/em exercício em outro órgão.
         *
         * @return Conteúdo do campo respRemun
         */
        public String getRespRemun() {
          return this.respRemun;
        }

        /**
         * Informar se o empregador/órgão público declarante continuará informando remunerações
         * (S-1200/S-1202) do trabalhador cedido/em exercício em outro órgão.
         *
         * @param respRemun Valor para atribuir ao campo respRemun
         * @return O próprio IniCessao para continuar populando outros campos
         */
        public IniCessao<T> setRespRemun(String respRemun) {
          if (!"S".equals(respRemun) && !"N".equals(respRemun))
            throw new RuntimeException(
                "Valor " + String.valueOf(respRemun) + " inválido para o campo respRemun");
          this.respRemun = respRemun;
          return this;
        }
        /**
         * Sim
         *
         * @return O próprio IniCessao para continuar populando outros campos
         */
        public IniCessao<T> setRespRemun_S() {
          this.respRemun = "S";
          return this;
        }
        /**
         * Não
         *
         * @return O próprio IniCessao para continuar populando outros campos
         */
        public IniCessao<T> setRespRemun_N() {
          this.respRemun = "N";
          return this;
        }

        public IniCessao(Object pai) {
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
       * Informação de término da cessão/exercício em outro órgão.
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "dtTermCessao",
          })
      public static class FimCessao<T> {

        /** Preencher com a data de término da cessão/exercício em outro órgão. */
        private javax.xml.datatype.XMLGregorianCalendar dtTermCessao;

        /**
         * Preencher com a data de término da cessão/exercício em outro órgão.
         *
         * @return Conteúdo do campo dtTermCessao
         */
        public javax.xml.datatype.XMLGregorianCalendar getDtTermCessao() {
          return this.dtTermCessao;
        }

        /**
         * Preencher com a data de término da cessão/exercício em outro órgão.
         *
         * <p>Validação: Deve-se obedecer às seguintes regras:
         *
         * <p>a) Deve ser igual ou posterior à data de início da cessão/exercício em outro órgão;
         *
         * <p>b) Não pode ser posterior à data atual.
         *
         * @param dtTermCessao Valor para atribuir ao campo dtTermCessao
         * @return O próprio FimCessao para continuar populando outros campos
         */
        public FimCessao<T> setDtTermCessao(javax.xml.datatype.XMLGregorianCalendar dtTermCessao) {
          this.dtTermCessao = dtTermCessao;
          return this;
        }

        public FimCessao(Object pai) {
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
