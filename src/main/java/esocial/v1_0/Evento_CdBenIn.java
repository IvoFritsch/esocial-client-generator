package esocial.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlTransient;

/** S-2410 - Cadastro de Benefício - Entes Públicos - Início */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "",
    propOrder = {
      "evtCdBenIn",
    })
@XmlRootElement(name = "eSocial")
public class Evento_CdBenIn {

  /** Evento Cadastro de Benefício - Início */
  private EvtCdBenIn evtCdBenIn;

  /**
   * Evento Cadastro de Benefício - Início
   *
   * @return Conteúdo do campo evtCdBenIn
   */
  public EvtCdBenIn getEvtCdBenIn() {
    return this.evtCdBenIn;
  }

  /**
   * Evento Cadastro de Benefício - Início
   *
   * <p>DESCRICAO_COMPLETA:Evento Cadastro de Benefício - Entes Públicos - Início.
   *
   * <p>CHAVE_GRUPO: {Id}
   *
   * <p>REGRA:REGRA_BENEFICIO_VALIDA_NUMERO
   *
   * <p>REGRA:REGRA_ENVIO_PROC_FECHAMENTO
   *
   * <p>REGRA:REGRA_EVENTOS_EXTEMP
   *
   * <p>REGRA:REGRA_EXISTE_INFO_EMPREGADOR
   *
   * <p>REGRA:REGRA_EXTEMP_REATIVACAO
   *
   * <p>REGRA:REGRA_MUDANCA_CPF
   *
   * <p>REGRA:REGRA_RETIFICA_MESMO_BENEFICIO
   *
   * <p>REGRA:REGRA_VALIDA_CNPJ
   *
   * @return O objeto EvtCdBenIn para população dos campos filhos
   */
  public EvtCdBenIn<Evento_CdBenIn> setEvtCdBenIn() {
    if (this.evtCdBenIn == null) {
      this.evtCdBenIn = new EvtCdBenIn(this);
    }
    return this.evtCdBenIn;
  }

  /**
   * Evento Cadastro de Benefício - Início
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "ideEvento",
        "ideEmpregador",
        "beneficiario",
        "infoBenInicio",
      })
  public static class EvtCdBenIn<T> {

    /** Informações de identificação do evento. */
    private Tipos.T_ideEvento_trab ideEvento;

    /** Informações de identificação do empregador. */
    private Tipos.T_ideEmpregador_cnpj ideEmpregador;

    /** Informações do beneficiário. */
    private Beneficiario beneficiario;

    /** Informações do benefício - Início. */
    private InfoBenInicio infoBenInicio;

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
    public Tipos.T_ideEvento_trab<EvtCdBenIn<T>> setIdeEvento() {
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
    public Tipos.T_ideEmpregador_cnpj<EvtCdBenIn<T>> setIdeEmpregador() {
      if (this.ideEmpregador == null) {
        this.ideEmpregador = new Tipos.T_ideEmpregador_cnpj(this);
      }
      return this.ideEmpregador;
    }

    /**
     * Informações do beneficiário.
     *
     * @return Conteúdo do campo beneficiario
     */
    public Beneficiario getBeneficiario() {
      return this.beneficiario;
    }

    /**
     * Informações do beneficiário.
     *
     * <p>CHAVE_GRUPO: {cpfBenef}
     *
     * @return O objeto Beneficiario para população dos campos filhos
     */
    public Beneficiario<EvtCdBenIn<T>> setBeneficiario() {
      if (this.beneficiario == null) {
        this.beneficiario = new Beneficiario(this);
      }
      return this.beneficiario;
    }

    /**
     * Informações do benefício - Início.
     *
     * @return Conteúdo do campo infoBenInicio
     */
    public InfoBenInicio getInfoBenInicio() {
      return this.infoBenInicio;
    }

    /**
     * Informações do benefício - Início.
     *
     * <p>CHAVE_GRUPO: {nrBeneficio}
     *
     * @return O objeto InfoBenInicio para população dos campos filhos
     */
    public InfoBenInicio<EvtCdBenIn<T>> setInfoBenInicio() {
      if (this.infoBenInicio == null) {
        this.infoBenInicio = new InfoBenInicio(this);
      }
      return this.infoBenInicio;
    }

    public EvtCdBenIn(Object pai) {
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
     * Informações do beneficiário.
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "cpfBenef",
          "matricula",
          "cnpjOrigem",
        })
    public static class Beneficiario<T> {

      /** Informar o CPF do beneficiário. */
      private String cpfBenef;

      /**
       * Matrícula do servidor/militar constante no Sistema de Administração de Recursos Humanos do
       * órgão cujo vínculo deu ensejo ao benefício. No caso de pensão por morte, informar a
       * matrícula do instituidor da pensão.
       */
      private String matricula;

      /**
       * Preencher com o CNPJ do órgão público responsável pela matrícula do servidor/militar.
       * Informação obrigatória se {cadIni}(2410_infoBenInicio_cadIni) = [N], desde que haja
       * informação de matrícula e que o CNPJ seja diferente do CNPJ do órgão declarante.
       */
      private String cnpjOrigem;

      /**
       * Informar o CPF do beneficiário.
       *
       * @return Conteúdo do campo cpfBenef
       */
      public String getCpfBenef() {
        return this.cpfBenef;
      }

      /**
       * Informar o CPF do beneficiário.
       *
       * <p>Validação: Deve observar o que segue:
       *
       * <p>a) Se {cadIni}(2410_infoBenInicio_cadIni) = [S], deve estar cadastrado no evento S-2400
       * com data de início igual à data de obrigatoriedade dos eventos não periódicos para o ente
       * público no eSocial;
       *
       * <p>b) Se {indSitBenef}(2410_infoBenInicio_indSitBenef) = [1], deve estar cadastrado no
       * evento S-2400 com data de início igual ou anterior a
       * {dtIniBeneficio}(2410_infoBenInicio_dtIniBeneficio) (ou a
       * {dtPublic}(2410_infoBenInicio_dtPublic), caso este campo tenha sido informado);
       *
       * <p>c) Se {indSitBenef}(2410_infoBenInicio_indSitBenef) = [2, 3], deve estar cadastrado no
       * evento S-2400 com data de início igual ou anterior a
       * {dtTransf}(2410_infoBenInicio_sucessaoBenef_dtTransf) ou
       * {dtAltCPF}(2410_infoBenInicio_mudancaCPF_dtAltCPF), respectivamente.
       *
       * @param cpfBenef Valor para atribuir ao campo cpfBenef
       * @return O próprio Beneficiario para continuar populando outros campos
       */
      public Beneficiario<T> setCpfBenef(String cpfBenef) {
        this.cpfBenef = cpfBenef;
        return this;
      }

      /**
       * Matrícula do servidor/militar constante no Sistema de Administração de Recursos Humanos do
       * órgão cujo vínculo deu ensejo ao benefício. No caso de pensão por morte, informar a
       * matrícula do instituidor da pensão.
       *
       * @return Conteúdo do campo matricula
       */
      public String getMatricula() {
        return this.matricula;
      }

      /**
       * Matrícula do servidor/militar constante no Sistema de Administração de Recursos Humanos do
       * órgão cujo vínculo deu ensejo ao benefício. No caso de pensão por morte, informar a
       * matrícula do instituidor da pensão.
       *
       * <p>Validação: Informação obrigatória se {cadIni}(2410_infoBenInicio_cadIni) = [N] e
       * {tpBeneficio}(2410_infoBenInicio_dadosBeneficio_tpBeneficio) pertencer ao grupo [01, 02,
       * 03, 04, 05, 06, 11] da Tabela 25.
       *
       * @param matricula Valor para atribuir ao campo matricula
       * @return O próprio Beneficiario para continuar populando outros campos
       */
      public Beneficiario<T> setMatricula(String matricula) {
        this.matricula = matricula;
        return this;
      }

      /**
       * Preencher com o CNPJ do órgão público responsável pela matrícula do servidor/militar.
       * Informação obrigatória se {cadIni}(2410_infoBenInicio_cadIni) = [N], desde que haja
       * informação de matrícula e que o CNPJ seja diferente do CNPJ do órgão declarante.
       *
       * @return Conteúdo do campo cnpjOrigem
       */
      public String getCnpjOrigem() {
        return this.cnpjOrigem;
      }

      /**
       * Preencher com o CNPJ do órgão público responsável pela matrícula do servidor/militar.
       * Informação obrigatória se {cadIni}(2410_infoBenInicio_cadIni) = [N], desde que haja
       * informação de matrícula e que o CNPJ seja diferente do CNPJ do órgão declarante.
       *
       * <p>Validação: Preenchimento obrigatório se {cadIni}(2410_infoBenInicio_cadIni) = [N] e
       * houver informação de {matricula}(./matricula), exceto se existir vínculo (evento S-2200)
       * para o beneficiário (indicado em {cpfBenef}(./cpfBenef) e {matricula}(./matricula)) no
       * órgão declarante.
       *
       * <p>Se informado, deve ser um CNPJ válido e diferente do CNPJ do órgão público declarante,
       * com 14 (catorze) algarismos.
       *
       * @param cnpjOrigem Valor para atribuir ao campo cnpjOrigem
       * @return O próprio Beneficiario para continuar populando outros campos
       */
      public Beneficiario<T> setCnpjOrigem(String cnpjOrigem) {
        this.cnpjOrigem = cnpjOrigem;
        return this;
      }

      public Beneficiario(Object pai) {
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
     * Informações do benefício - Início.
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "cadIni",
          "indSitBenef",
          "nrBeneficio",
          "dtIniBeneficio",
          "dtPublic",
          "dadosBeneficio",
          "sucessaoBenef",
          "mudancaCPF",
          "infoBenTermino",
        })
    public static class InfoBenInicio<T> {

      /**
       * Indicar se a data de início do benefício é anterior à obrigatoriedade dos eventos não
       * periódicos para o ente público no eSocial.
       */
      private String cadIni;

      /** Indicar a situação do benefício no órgão declarante. */
      private String indSitBenef;

      /** Número do benefício. */
      private String nrBeneficio;

      /** Data de início do benefício. */
      private javax.xml.datatype.XMLGregorianCalendar dtIniBeneficio;

      /**
       * Informar a data de publicação da concessão do benefício, somente quando o ato concessório
       * tiver vigência retroativa.
       */
      private javax.xml.datatype.XMLGregorianCalendar dtPublic;

      /** Dados relativos ao benefício. */
      private DadosBeneficio dadosBeneficio;

      /** Grupo de informações de transferência de benefício. */
      private SucessaoBenef sucessaoBenef;

      /** Informações de mudança de CPF do beneficiário. */
      private MudancaCPF mudancaCPF;

      /** Informações da cessação do benefício */
      private InfoBenTermino infoBenTermino;

      /**
       * Indicar se a data de início do benefício é anterior à obrigatoriedade dos eventos não
       * periódicos para o ente público no eSocial.
       *
       * @return Conteúdo do campo cadIni
       */
      public String getCadIni() {
        return this.cadIni;
      }

      /**
       * Indicar se a data de início do benefício é anterior à obrigatoriedade dos eventos não
       * periódicos para o ente público no eSocial.
       *
       * @param cadIni Valor para atribuir ao campo cadIni
       * @return O próprio InfoBenInicio para continuar populando outros campos
       */
      public InfoBenInicio<T> setCadIni(String cadIni) {
        if (!"S".equals(cadIni) && !"N".equals(cadIni))
          throw new RuntimeException(
              "Valor " + String.valueOf(cadIni) + " inválido para o campo cadIni");
        this.cadIni = cadIni;
        return this;
      }
      /**
       * Sim
       *
       * @return O próprio InfoBenInicio para continuar populando outros campos
       */
      public InfoBenInicio<T> setCadIni_S() {
        this.cadIni = "S";
        return this;
      }
      /**
       * Não
       *
       * @return O próprio InfoBenInicio para continuar populando outros campos
       */
      public InfoBenInicio<T> setCadIni_N() {
        this.cadIni = "N";
        return this;
      }

      /**
       * Indicar a situação do benefício no órgão declarante.
       *
       * @return Conteúdo do campo indSitBenef
       */
      public String getIndSitBenef() {
        return this.indSitBenef;
      }

      /**
       * Indicar a situação do benefício no órgão declarante.
       *
       * <p>Validação: Preenchimento obrigatório e exclusivo se {cadIni}(./cadIni) = [N].
       *
       * @param indSitBenef Valor para atribuir ao campo indSitBenef
       * @return O próprio InfoBenInicio para continuar populando outros campos
       */
      public InfoBenInicio<T> setIndSitBenef(String indSitBenef) {
        if (!"1".equals(indSitBenef) && !"2".equals(indSitBenef) && !"3".equals(indSitBenef))
          throw new RuntimeException(
              "Valor " + String.valueOf(indSitBenef) + " inválido para o campo indSitBenef");
        this.indSitBenef = indSitBenef;
        return this;
      }
      /**
       * Benefício concedido pelo próprio órgão declarante
       *
       * @return O próprio InfoBenInicio para continuar populando outros campos
       */
      public InfoBenInicio<T> setIndSitBenef_1() {
        this.indSitBenef = "1";
        return this;
      }
      /**
       * Benefício transferido de outro órgão
       *
       * @return O próprio InfoBenInicio para continuar populando outros campos
       */
      public InfoBenInicio<T> setIndSitBenef_2() {
        this.indSitBenef = "2";
        return this;
      }
      /**
       * Mudança de CPF do beneficiário
       *
       * @return O próprio InfoBenInicio para continuar populando outros campos
       */
      public InfoBenInicio<T> setIndSitBenef_3() {
        this.indSitBenef = "3";
        return this;
      }

      /**
       * Número do benefício.
       *
       * @return Conteúdo do campo nrBeneficio
       */
      public String getNrBeneficio() {
        return this.nrBeneficio;
      }

      /**
       * Número do benefício.
       *
       * @param nrBeneficio Valor para atribuir ao campo nrBeneficio
       * @return O próprio InfoBenInicio para continuar populando outros campos
       */
      public InfoBenInicio<T> setNrBeneficio(String nrBeneficio) {
        this.nrBeneficio = nrBeneficio;
        return this;
      }

      /**
       * Data de início do benefício.
       *
       * @return Conteúdo do campo dtIniBeneficio
       */
      public javax.xml.datatype.XMLGregorianCalendar getDtIniBeneficio() {
        return this.dtIniBeneficio;
      }

      /**
       * Data de início do benefício.
       *
       * <p>Validação: Deve observar o que segue:
       *
       * <p>a) Se {cadIni}(./cadIni) = [S], deve ser anterior à data de início da obrigatoriedade
       * dos eventos não periódicos para o ente público no eSocial;
       *
       * <p>b) Se {cadIni}(./cadIni) = [N], deve ser igual ou posterior à data de início da
       * obrigatoriedade dos eventos não periódicos para o ente público no eSocial e igual ou
       * anterior à data atual.
       *
       * @param dtIniBeneficio Valor para atribuir ao campo dtIniBeneficio
       * @return O próprio InfoBenInicio para continuar populando outros campos
       */
      public InfoBenInicio<T> setDtIniBeneficio(
          javax.xml.datatype.XMLGregorianCalendar dtIniBeneficio) {
        this.dtIniBeneficio = dtIniBeneficio;
        return this;
      }

      /**
       * Informar a data de publicação da concessão do benefício, somente quando o ato concessório
       * tiver vigência retroativa.
       *
       * @return Conteúdo do campo dtPublic
       */
      public javax.xml.datatype.XMLGregorianCalendar getDtPublic() {
        return this.dtPublic;
      }

      /**
       * Informar a data de publicação da concessão do benefício, somente quando o ato concessório
       * tiver vigência retroativa.
       *
       * <p>Validação: Deve ser posterior a {dtIniBeneficio}(./dtIniBeneficio).
       *
       * @param dtPublic Valor para atribuir ao campo dtPublic
       * @return O próprio InfoBenInicio para continuar populando outros campos
       */
      public InfoBenInicio<T> setDtPublic(javax.xml.datatype.XMLGregorianCalendar dtPublic) {
        this.dtPublic = dtPublic;
        return this;
      }

      /**
       * Dados relativos ao benefício.
       *
       * @return Conteúdo do campo dadosBeneficio
       */
      public DadosBeneficio getDadosBeneficio() {
        return this.dadosBeneficio;
      }

      /**
       * Dados relativos ao benefício.
       *
       * @return O objeto DadosBeneficio para população dos campos filhos
       */
      public DadosBeneficio<InfoBenInicio<T>> setDadosBeneficio() {
        if (this.dadosBeneficio == null) {
          this.dadosBeneficio = new DadosBeneficio(this);
        }
        return this.dadosBeneficio;
      }

      /**
       * Grupo de informações de transferência de benefício.
       *
       * @return Conteúdo do campo sucessaoBenef
       */
      public SucessaoBenef getSucessaoBenef() {
        return this.sucessaoBenef;
      }

      /**
       * Grupo de informações de transferência de benefício.
       *
       * <p>CONDICAO_GRUPO: O (se {indSitBenef}(2410_infoBenInicio_indSitBenef) = [2]); N (nos
       * demais casos)
       *
       * @return O objeto SucessaoBenef para população dos campos filhos
       */
      public SucessaoBenef<InfoBenInicio<T>> setSucessaoBenef() {
        if (this.sucessaoBenef == null) {
          this.sucessaoBenef = new SucessaoBenef(this);
        }
        return this.sucessaoBenef;
      }

      /**
       * Informações de mudança de CPF do beneficiário.
       *
       * @return Conteúdo do campo mudancaCPF
       */
      public MudancaCPF getMudancaCPF() {
        return this.mudancaCPF;
      }

      /**
       * Informações de mudança de CPF do beneficiário.
       *
       * <p>CONDICAO_GRUPO: O (se {indSitBenef}(2410_infoBenInicio_indSitBenef) = [3]); N (nos
       * demais casos)
       *
       * @return O objeto MudancaCPF para população dos campos filhos
       */
      public MudancaCPF<InfoBenInicio<T>> setMudancaCPF() {
        if (this.mudancaCPF == null) {
          this.mudancaCPF = new MudancaCPF(this);
        }
        return this.mudancaCPF;
      }

      /**
       * Informações da cessação do benefício
       *
       * @return Conteúdo do campo infoBenTermino
       */
      public InfoBenTermino getInfoBenTermino() {
        return this.infoBenTermino;
      }

      /**
       * Informações da cessação do benefício
       *
       * <p>DESCRICAO_COMPLETA:Informações da cessação do benefício.
       *
       * <p>Grupo preenchido exclusivamente caso seja necessário enviar evento de reativação de
       * benefício cessado antes do início dos eventos não periódicos para o ente público no eSocial
       * ou para informação de diferenças de proventos e pensões devidos sob a vigência dos eventos
       * periódicos para o ente público no eSocial.
       *
       * <p>CONDICAO_GRUPO: OC (se {cadIni}(2410_infoBenInicio_cadIni) = [S] ou
       * {indSitBenef}(2410_infoBenInicio_indSitBenef) = [2]); N (nos demais casos)
       *
       * @return O objeto InfoBenTermino para população dos campos filhos
       */
      public InfoBenTermino<InfoBenInicio<T>> setInfoBenTermino() {
        if (this.infoBenTermino == null) {
          this.infoBenTermino = new InfoBenTermino(this);
        }
        return this.infoBenTermino;
      }

      public InfoBenInicio(Object pai) {
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
       * Dados relativos ao benefício.
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "tpBeneficio",
            "tpPlanRP",
            "dsc",
            "indDecJud",
            "infoPenMorte",
          })
      public static class DadosBeneficio<T> {

        /** Tipo de benefício. */
        private Integer tpBeneficio;

        /** Tipo de plano de segregação da massa. */
        private String tpPlanRP;

        /** Descrição do instrumento ou situação que originou o pagamento do benefício. */
        private String dsc;

        /** Informar se o benefício foi concedido por determinação judicial. */
        private String indDecJud;

        /** Informações relativas à pensão por morte. */
        private InfoPenMorte infoPenMorte;

        /**
         * Tipo de benefício.
         *
         * @return Conteúdo do campo tpBeneficio
         */
        public Integer getTpBeneficio() {
          return this.tpBeneficio;
        }

        /**
         * Tipo de benefício.
         *
         * <p>Validação: Deve ser um código válido e existente na Tabela 25. Se
         * {cadIni}(2410_infoBenInicio_cadIni) = [N], não é permitido utilizar código do grupo [08]
         * dessa tabela.
         *
         * @param tpBeneficio Valor para atribuir ao campo tpBeneficio
         * @return O próprio DadosBeneficio para continuar populando outros campos
         */
        public DadosBeneficio<T> setTpBeneficio(Integer tpBeneficio) {
          this.tpBeneficio = tpBeneficio;
          return this;
        }

        /**
         * Tipo de plano de segregação da massa.
         *
         * @return Conteúdo do campo tpPlanRP
         */
        public String getTpPlanRP() {
          return this.tpPlanRP;
        }

        /**
         * Tipo de plano de segregação da massa.
         *
         * @param tpPlanRP Valor para atribuir ao campo tpPlanRP
         * @return O próprio DadosBeneficio para continuar populando outros campos
         */
        public DadosBeneficio<T> setTpPlanRP(String tpPlanRP) {
          if (!"0".equals(tpPlanRP)
              && !"1".equals(tpPlanRP)
              && !"2".equals(tpPlanRP)
              && !"3".equals(tpPlanRP))
            throw new RuntimeException(
                "Valor " + String.valueOf(tpPlanRP) + " inválido para o campo tpPlanRP");
          this.tpPlanRP = tpPlanRP;
          return this;
        }
        /**
         * Sem segregação da massa
         *
         * @return O próprio DadosBeneficio para continuar populando outros campos
         */
        public DadosBeneficio<T> setTpPlanRP_0() {
          this.tpPlanRP = "0";
          return this;
        }
        /**
         * Fundo em capitalização
         *
         * @return O próprio DadosBeneficio para continuar populando outros campos
         */
        public DadosBeneficio<T> setTpPlanRP_1() {
          this.tpPlanRP = "1";
          return this;
        }
        /**
         * Fundo em repartição
         *
         * @return O próprio DadosBeneficio para continuar populando outros campos
         */
        public DadosBeneficio<T> setTpPlanRP_2() {
          this.tpPlanRP = "2";
          return this;
        }
        /**
         * Mantido pelo Tesouro
         *
         * @return O próprio DadosBeneficio para continuar populando outros campos
         */
        public DadosBeneficio<T> setTpPlanRP_3() {
          this.tpPlanRP = "3";
          return this;
        }

        /**
         * Descrição do instrumento ou situação que originou o pagamento do benefício.
         *
         * @return Conteúdo do campo dsc
         */
        public String getDsc() {
          return this.dsc;
        }

        /**
         * Descrição do instrumento ou situação que originou o pagamento do benefício.
         *
         * <p>Validação: Preenchimento obrigatório se {tpBeneficio}(./tpBeneficio) = [0909, 1001,
         * 1009].
         *
         * @param dsc Valor para atribuir ao campo dsc
         * @return O próprio DadosBeneficio para continuar populando outros campos
         */
        public DadosBeneficio<T> setDsc(String dsc) {
          this.dsc = dsc;
          return this;
        }

        /**
         * Informar se o benefício foi concedido por determinação judicial.
         *
         * @return Conteúdo do campo indDecJud
         */
        public String getIndDecJud() {
          return this.indDecJud;
        }

        /**
         * Informar se o benefício foi concedido por determinação judicial.
         *
         * <p>Validação: Preenchimento obrigatório se {cadIni}(2410_infoBenInicio_cadIni) = [N].
         *
         * @param indDecJud Valor para atribuir ao campo indDecJud
         * @return O próprio DadosBeneficio para continuar populando outros campos
         */
        public DadosBeneficio<T> setIndDecJud(String indDecJud) {
          if (!"S".equals(indDecJud) && !"N".equals(indDecJud))
            throw new RuntimeException(
                "Valor " + String.valueOf(indDecJud) + " inválido para o campo indDecJud");
          this.indDecJud = indDecJud;
          return this;
        }
        /**
         * Sim
         *
         * @return O próprio DadosBeneficio para continuar populando outros campos
         */
        public DadosBeneficio<T> setIndDecJud_S() {
          this.indDecJud = "S";
          return this;
        }
        /**
         * Não
         *
         * @return O próprio DadosBeneficio para continuar populando outros campos
         */
        public DadosBeneficio<T> setIndDecJud_N() {
          this.indDecJud = "N";
          return this;
        }

        /**
         * Informações relativas à pensão por morte.
         *
         * @return Conteúdo do campo infoPenMorte
         */
        public InfoPenMorte getInfoPenMorte() {
          return this.infoPenMorte;
        }

        /**
         * Informações relativas à pensão por morte.
         *
         * <p>CONDICAO_GRUPO: O (se {tpBeneficio}(../tpBeneficio) pertencer ao grupo [06]); N (nos
         * demais casos)
         *
         * @return O objeto InfoPenMorte para população dos campos filhos
         */
        public InfoPenMorte<DadosBeneficio<T>> setInfoPenMorte() {
          if (this.infoPenMorte == null) {
            this.infoPenMorte = new InfoPenMorte(this);
          }
          return this.infoPenMorte;
        }

        public DadosBeneficio(Object pai) {
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
         * Informações relativas à pensão por morte.
         *
         * @param <T> Tipo do retorno do método finish()
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(
            name = "",
            propOrder = {
              "tpPenMorte",
              "instPenMorte",
            })
        public static class InfoPenMorte<T> {

          /** Tipo de pensão por morte. */
          private String tpPenMorte;

          /** Informações do instituidor da pensão por morte. */
          private InstPenMorte instPenMorte;

          /**
           * Tipo de pensão por morte.
           *
           * @return Conteúdo do campo tpPenMorte
           */
          public String getTpPenMorte() {
            return this.tpPenMorte;
          }

          /**
           * Tipo de pensão por morte.
           *
           * @param tpPenMorte Valor para atribuir ao campo tpPenMorte
           * @return O próprio InfoPenMorte para continuar populando outros campos
           */
          public InfoPenMorte<T> setTpPenMorte(String tpPenMorte) {
            if (!"1".equals(tpPenMorte) && !"2".equals(tpPenMorte))
              throw new RuntimeException(
                  "Valor " + String.valueOf(tpPenMorte) + " inválido para o campo tpPenMorte");
            this.tpPenMorte = tpPenMorte;
            return this;
          }
          /**
           * Vitalícia
           *
           * @return O próprio InfoPenMorte para continuar populando outros campos
           */
          public InfoPenMorte<T> setTpPenMorte_1() {
            this.tpPenMorte = "1";
            return this;
          }
          /**
           * Temporária
           *
           * @return O próprio InfoPenMorte para continuar populando outros campos
           */
          public InfoPenMorte<T> setTpPenMorte_2() {
            this.tpPenMorte = "2";
            return this;
          }

          /**
           * Informações do instituidor da pensão por morte.
           *
           * @return Conteúdo do campo instPenMorte
           */
          public InstPenMorte getInstPenMorte() {
            return this.instPenMorte;
          }

          /**
           * Informações do instituidor da pensão por morte.
           *
           * <p>CONDICAO_GRUPO: O (se {cadIni}(2410_infoBenInicio_cadIni) = [N]); F (se
           * {cadIni}(2410_infoBenInicio_cadIni) = [S])
           *
           * @return O objeto InstPenMorte para população dos campos filhos
           */
          public InstPenMorte<InfoPenMorte<T>> setInstPenMorte() {
            if (this.instPenMorte == null) {
              this.instPenMorte = new InstPenMorte(this);
            }
            return this.instPenMorte;
          }

          public InfoPenMorte(Object pai) {
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
           * Informações do instituidor da pensão por morte.
           *
           * @param <T> Tipo do retorno do método finish()
           */
          @XmlAccessorType(XmlAccessType.FIELD)
          @XmlType(
              name = "",
              propOrder = {
                "cpfInst", "dtInst",
              })
          public static class InstPenMorte<T> {

            /** Preencher com o CPF do instituidor da pensão por morte. */
            private String cpfInst;

            /** Data de óbito do instituidor da pensão por morte. */
            private javax.xml.datatype.XMLGregorianCalendar dtInst;

            /**
             * Preencher com o CPF do instituidor da pensão por morte.
             *
             * @return Conteúdo do campo cpfInst
             */
            public String getCpfInst() {
              return this.cpfInst;
            }

            /**
             * Preencher com o CPF do instituidor da pensão por morte.
             *
             * <p>Validação: Deve ser um CPF válido.
             *
             * @param cpfInst Valor para atribuir ao campo cpfInst
             * @return O próprio InstPenMorte para continuar populando outros campos
             */
            public InstPenMorte<T> setCpfInst(String cpfInst) {
              this.cpfInst = cpfInst;
              return this;
            }

            /**
             * Data de óbito do instituidor da pensão por morte.
             *
             * @return Conteúdo do campo dtInst
             */
            public javax.xml.datatype.XMLGregorianCalendar getDtInst() {
              return this.dtInst;
            }

            /**
             * Data de óbito do instituidor da pensão por morte.
             *
             * @param dtInst Valor para atribuir ao campo dtInst
             * @return O próprio InstPenMorte para continuar populando outros campos
             */
            public InstPenMorte<T> setDtInst(javax.xml.datatype.XMLGregorianCalendar dtInst) {
              this.dtInst = dtInst;
              return this;
            }

            public InstPenMorte(Object pai) {
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
       * Grupo de informações de transferência de benefício.
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "cnpjOrgaoAnt",
            "nrBeneficioAnt",
            "dtTransf",
            "observacao",
          })
      public static class SucessaoBenef<T> {

        /** Informar o CNPJ do órgão público anterior. */
        private String cnpjOrgaoAnt;

        /** Número do benefício no ente público anterior. */
        private String nrBeneficioAnt;

        /** Preencher com a data da transferência do benefício para o órgão público declarante. */
        private javax.xml.datatype.XMLGregorianCalendar dtTransf;

        /** Observação. */
        private String observacao;

        /**
         * Informar o CNPJ do órgão público anterior.
         *
         * @return Conteúdo do campo cnpjOrgaoAnt
         */
        public String getCnpjOrgaoAnt() {
          return this.cnpjOrgaoAnt;
        }

        /**
         * Informar o CNPJ do órgão público anterior.
         *
         * <p>Validação: Deve ser um CNPJ válido e diferente da inscrição do declarante,
         * considerando as particularidades aplicadas à informação de CNPJ de órgão público em
         * S-1000. Além disso, deve possuir 14 (catorze) algarismos e ser diferente do CNPJ base do
         * órgão público declarante (exceto se {ideEmpregador/nrInsc}(2410_ideEmpregador_nrInsc)
         * tiver 14 (catorze) algarismos) e dos estabelecimentos informados através do evento
         * S-1005.
         *
         * @param cnpjOrgaoAnt Valor para atribuir ao campo cnpjOrgaoAnt
         * @return O próprio SucessaoBenef para continuar populando outros campos
         */
        public SucessaoBenef<T> setCnpjOrgaoAnt(String cnpjOrgaoAnt) {
          this.cnpjOrgaoAnt = cnpjOrgaoAnt;
          return this;
        }

        /**
         * Número do benefício no ente público anterior.
         *
         * @return Conteúdo do campo nrBeneficioAnt
         */
        public String getNrBeneficioAnt() {
          return this.nrBeneficioAnt;
        }

        /**
         * Número do benefício no ente público anterior.
         *
         * @param nrBeneficioAnt Valor para atribuir ao campo nrBeneficioAnt
         * @return O próprio SucessaoBenef para continuar populando outros campos
         */
        public SucessaoBenef<T> setNrBeneficioAnt(String nrBeneficioAnt) {
          this.nrBeneficioAnt = nrBeneficioAnt;
          return this;
        }

        /**
         * Preencher com a data da transferência do benefício para o órgão público declarante.
         *
         * @return Conteúdo do campo dtTransf
         */
        public javax.xml.datatype.XMLGregorianCalendar getDtTransf() {
          return this.dtTransf;
        }

        /**
         * Preencher com a data da transferência do benefício para o órgão público declarante.
         *
         * <p>Validação: Devem ser observadas as seguintes regras:
         *
         * <p>a) Deve ser posterior à data de início do benefício;
         *
         * <p>b) Deve ser igual ou posterior à data de início da obrigatoriedade dos eventos não
         * periódicos para o ente público no eSocial e igual ou anterior à data atual.
         *
         * @param dtTransf Valor para atribuir ao campo dtTransf
         * @return O próprio SucessaoBenef para continuar populando outros campos
         */
        public SucessaoBenef<T> setDtTransf(javax.xml.datatype.XMLGregorianCalendar dtTransf) {
          this.dtTransf = dtTransf;
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
         * @return O próprio SucessaoBenef para continuar populando outros campos
         */
        public SucessaoBenef<T> setObservacao(String observacao) {
          this.observacao = observacao;
          return this;
        }

        public SucessaoBenef(Object pai) {
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
       * Informações de mudança de CPF do beneficiário.
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "cpfAnt",
            "nrBeneficioAnt",
            "dtAltCPF",
            "observacao",
          })
      public static class MudancaCPF<T> {

        /** Preencher com o número do CPF antigo do beneficiário. */
        private String cpfAnt;

        /** Preencher com o número do benefício anterior. */
        private String nrBeneficioAnt;

        /** Data de alteração do CPF. */
        private javax.xml.datatype.XMLGregorianCalendar dtAltCPF;

        /** Observação. */
        private String observacao;

        /**
         * Preencher com o número do CPF antigo do beneficiário.
         *
         * @return Conteúdo do campo cpfAnt
         */
        public String getCpfAnt() {
          return this.cpfAnt;
        }

        /**
         * Preencher com o número do CPF antigo do beneficiário.
         *
         * @param cpfAnt Valor para atribuir ao campo cpfAnt
         * @return O próprio MudancaCPF para continuar populando outros campos
         */
        public MudancaCPF<T> setCpfAnt(String cpfAnt) {
          this.cpfAnt = cpfAnt;
          return this;
        }

        /**
         * Preencher com o número do benefício anterior.
         *
         * @return Conteúdo do campo nrBeneficioAnt
         */
        public String getNrBeneficioAnt() {
          return this.nrBeneficioAnt;
        }

        /**
         * Preencher com o número do benefício anterior.
         *
         * @param nrBeneficioAnt Valor para atribuir ao campo nrBeneficioAnt
         * @return O próprio MudancaCPF para continuar populando outros campos
         */
        public MudancaCPF<T> setNrBeneficioAnt(String nrBeneficioAnt) {
          this.nrBeneficioAnt = nrBeneficioAnt;
          return this;
        }

        /**
         * Data de alteração do CPF.
         *
         * @return Conteúdo do campo dtAltCPF
         */
        public javax.xml.datatype.XMLGregorianCalendar getDtAltCPF() {
          return this.dtAltCPF;
        }

        /**
         * Data de alteração do CPF.
         *
         * @param dtAltCPF Valor para atribuir ao campo dtAltCPF
         * @return O próprio MudancaCPF para continuar populando outros campos
         */
        public MudancaCPF<T> setDtAltCPF(javax.xml.datatype.XMLGregorianCalendar dtAltCPF) {
          this.dtAltCPF = dtAltCPF;
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
         * @return O próprio MudancaCPF para continuar populando outros campos
         */
        public MudancaCPF<T> setObservacao(String observacao) {
          this.observacao = observacao;
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
       * Informações da cessação do benefício
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "dtTermBeneficio",
            "mtvTermino",
          })
      public static class InfoBenTermino<T> {

        /** Data de cessação do benefício. */
        private javax.xml.datatype.XMLGregorianCalendar dtTermBeneficio;

        /** Motivo da cessação do benefício. */
        private String mtvTermino;

        /**
         * Data de cessação do benefício.
         *
         * @return Conteúdo do campo dtTermBeneficio
         */
        public javax.xml.datatype.XMLGregorianCalendar getDtTermBeneficio() {
          return this.dtTermBeneficio;
        }

        /**
         * Data de cessação do benefício.
         *
         * <p>Validação: Devem ser observadas as seguintes regras:
         *
         * <p>a) Deve ser igual ou posterior à data de início do benefício;
         *
         * <p>b) Se {cadIni}(2410_infoBenInicio_cadIni) = [S], deve ser anterior à data de início da
         * obrigatoriedade dos eventos não periódicos para o ente público no eSocial;
         *
         * <p>c) Se {indSitBenef}(2410_infoBenInicio_indSitBenef) = [2], deve ser anterior a
         * {dtTransf}(2410_infoBenInicio_sucessaoBenef_dtTransf).
         *
         * @param dtTermBeneficio Valor para atribuir ao campo dtTermBeneficio
         * @return O próprio InfoBenTermino para continuar populando outros campos
         */
        public InfoBenTermino<T> setDtTermBeneficio(
            javax.xml.datatype.XMLGregorianCalendar dtTermBeneficio) {
          this.dtTermBeneficio = dtTermBeneficio;
          return this;
        }

        /**
         * Motivo da cessação do benefício.
         *
         * @return Conteúdo do campo mtvTermino
         */
        public String getMtvTermino() {
          return this.mtvTermino;
        }

        /**
         * Motivo da cessação do benefício.
         *
         * <p>Validação: Deve ser um código válido e existente na Tabela 26, com exceção dos códigos
         * [09, 10].
         *
         * @param mtvTermino Valor para atribuir ao campo mtvTermino
         * @return O próprio InfoBenTermino para continuar populando outros campos
         */
        public InfoBenTermino<T> setMtvTermino(String mtvTermino) {
          this.mtvTermino = mtvTermino;
          return this;
        }

        public InfoBenTermino(Object pai) {
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
