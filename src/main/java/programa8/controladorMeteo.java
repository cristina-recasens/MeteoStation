package programa8;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class controladorMeteo {
	@FXML
	private AnchorPane Pane1;

	@FXML
	private AnchorPane Pane2;

	@FXML
	private AnchorPane Pane3;

	@FXML
	private AnchorPane Pane4;

	@FXML
	private AnchorPane Pane5;

	@FXML
	private AnchorPane Pane6;

	@FXML
	private Pane Pane61;

	@FXML
	private AnchorPane Pane7;

	@FXML
	private Pane Pane71;

	@FXML
	private TabPane PaneGeneral;

	@FXML
	private Pane PaneMusica1;

	@FXML
	private Pane PaneMusica10;

	@FXML
	private Pane PaneMusica11;

	@FXML
	private Pane PaneMusica12;

	@FXML
	private Pane PaneMusica13;

	@FXML
	private Pane PaneMusica2;

	@FXML
	private Pane PaneMusica3;

	@FXML
	private Pane PaneMusica4;

	@FXML
	private Pane PaneMusica5;

	@FXML
	private Pane PaneMusica6;

	@FXML
	private Pane PaneMusica7;

	@FXML
	private Pane PaneMusica8;

	@FXML
	private Pane PaneMusica9;

	@FXML
	private Pane PanePluja1;

	@FXML
	private Pane PanePluja2;

	@FXML
	private Pane PaneTemp1;

	@FXML
	private Pane PaneTemp2;

	@FXML
	private Pane PaneVent1;

	@FXML
	private Pane PaneVent2;

	@FXML
	private Button botoAlarma;

	@FXML
	private Button botoBanderaCrono;

	@FXML
	private Button botoImportarMusica;

	@FXML
	private Button botoMusica1;

	@FXML
	private Button botoMusica10;

	@FXML
	private Button botoMusica11;

	@FXML
	private Button botoMusica12;

	@FXML
	private Button botoMusica13;

	@FXML
	private Button botoMusica2;

	@FXML
	private Button botoMusica3;

	@FXML
	private Button botoMusica4;

	@FXML
	private Button botoMusica5;

	@FXML
	private Button botoMusica6;

	@FXML
	private Button botoMusica7;

	@FXML
	private Button botoMusica8;

	@FXML
	private Button botoMusica9;

	@FXML
	private Button botoPlayCrono;

	@FXML
	private Button botoPlayMusica;

	@FXML
	private Button botoReiniciarCrono;

	@FXML
	private Button botoStopCrono;

	@FXML
	private Button botoStopMusica;

	@FXML
	private Button botoTimer;

	@FXML
	private Label etiAlarma;

	@FXML
	private Label etiCrono1;

	@FXML
	private Label etiCrono2;

	@FXML
	private Label etiDarreres24pluja;

	@FXML
	private Label etiDarreres24temp;

	@FXML
	private Label etiDarreres24vent;

	@FXML
	private Label etiDireccioVent;

	@FXML
	private Label etiEntrarNomMusica;

	@FXML
	private Label etiGraus1;

	@FXML
	private Label etiHora;

	@FXML
	private Label etiHoraRellotge;

	@FXML
	private Label etiHoraTimer;

	@FXML
	private Label etiKmHora1;

	@FXML
	private Label etiLitres1;

	@FXML
	private Label etiMaxTemp;

	@FXML
	private Label etiMaxVent;

	@FXML
	private Label etiMinTemp;

	@FXML
	private Label etiMinVent;

	@FXML
	private Label etiMinuts;

	@FXML
	private Label etiMinutsTimer;

	@FXML
	private Label etiMissatgeAlarma;

	@FXML
	private Label etiMissatgeTimer;

	@FXML
	private Label etiMitjanaTemp;

	@FXML
	private Label etiMusica1;

	@FXML
	private Label etiMusica10;

	@FXML
	private Label etiMusica11;

	@FXML
	private Label etiMusica12;

	@FXML
	private Label etiMusica13;

	@FXML
	private Label etiMusica2;

	@FXML
	private Label etiMusica3;

	@FXML
	private Label etiMusica4;

	@FXML
	private Label etiMusica5;

	@FXML
	private Label etiMusica6;

	@FXML
	private Label etiMusica7;

	@FXML
	private Label etiMusica8;

	@FXML
	private Label etiMusica9;

	@FXML
	private Label etiNomMusica;

	@FXML
	private Label etiNumDireccioVent;

	@FXML
	private Label etiNumMaxTemp;

	@FXML
	private Label etiNumMaxVent;

	@FXML
	private Label etiNumMinTemp;

	@FXML
	private Label etiNumMinVent;

	@FXML
	private Label etiNumMitjanaTemp;

	@FXML
	private Label etiNumPluja;

	@FXML
	private Label etiPluja1;

	@FXML
	private Label etiPuntsAlarma1;

	@FXML
	private Label etiPuntsAlarma2;

	@FXML
	private Label etiPuntsTimer1;

	@FXML
	private Label etiPuntsTimer2;

	@FXML
	private Tab etiRellotge;

	@FXML
	private Label etiSegons;

	@FXML
	private Label etiSegonsTimer;

	@FXML
	private Label etiTemperatura1;

	@FXML
	private Label etiTimer;

	@FXML
	private Label etiTitolAlarma;

	@FXML
	private Label etiTitolTimer;

	@FXML
	private Label etiUnitatsPluja;

	@FXML
	private Label etiVent1;

	@FXML
	private Label etiVolta;

	@FXML
	private BarChart<String, Number> graficPluja;

	@FXML
	private LineChart<String, Number> graficTemp;

	@FXML
	private BarChart<Number, String> graficVent;

	@FXML
	private ImageView imatgeBanderaCrono;

	@FXML
	private ImageView imatgeFletxa;

	@FXML
	private ImageView imatgePlayCrono;

	@FXML
	private ImageView imatgePlayMusica;

	@FXML
	private ImageView imatgePluja;

	@FXML
	private ImageView imatgePluja2;

	@FXML
	private ImageView imatgeReiniciarCrono;

	@FXML
	private ImageView imatgeStopCrono;

	@FXML
	private ImageView imatgeStopMusica;

	@FXML
	private ImageView imatgeTemp;

	@FXML
	private ImageView imatgeTemp2;

	@FXML
	private ImageView imatgeVent1;

	@FXML
	private ImageView imatgeVent2;

	@FXML
	private TextField textHoraAlarma;

	@FXML
	private TextField textHoraTimer;

	@FXML
	private TextField textMinutAlarma;

	@FXML
	private TextField textMinutTimer;

	@FXML
	private TextField textNomMusica;

	@FXML
	private TextField textSegonAlarma;

	@FXML
	private TextField textSegonTimer;

	@FXML
	void initialize() {
		inicialitzarPaneEstacio();
		inicialitzarPaneHistorial();
		inicialitzarPaneRellotge();
		inicialitzarPaneAlarma();
		inicialitzarPaneTimer();
		inicialitzarPaneCrono();
		inicialitzarPaneMusica();
	}

	void inicialitzarPaneEstacio() {

		Timeline timelineEstacio = new Timeline();

		timelineEstacio.setCycleCount(Animation.INDEFINITE);

		Termometre temp1 = new Termometre();
		etiTemperatura1.setText("" + temp1.getTemperaturaActual());

		Pluviometre pluja1 = new Pluviometre();
		etiPluja1.setText("" + pluja1.getPlujaDarreraHora());

		Anemometre vent1 = new Anemometre();
		etiVent1.setText("" + vent1.getVentActual());
		String direccioVent = vent1.getDireccioVentActual();

		try {
			Image foto = new Image(getClass().getResourceAsStream("/programa8/imatges/" + direccioVent + ".png"));
			imatgeFletxa.setImage(foto);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// definim un keyFram per a que canvi cada minut
		KeyFrame keyFrameEstacio = new KeyFrame(Duration.seconds(60), new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {

				Termometre temp1 = new Termometre();
				etiTemperatura1.setText("" + temp1.getTemperaturaActual());

				Pluviometre pluja1 = new Pluviometre();
				etiPluja1.setText("" + pluja1.getPlujaDarreraHora());

				Anemometre vent1 = new Anemometre();
				etiVent1.setText("" + vent1.getVentActual());
				String direccioVent = vent1.getDireccioVentActual();

				try {
					Image foto = new Image(
							getClass().getResourceAsStream("/programa8/imatges/" + direccioVent + ".png"));
					imatgeFletxa.setImage(foto);

				} catch (Exception e) {
					System.out.println(e.getMessage());
				}

			}
		});
		// Agregar el KeyFrame a la Timeline
		timelineEstacio.getKeyFrames().add(keyFrameEstacio);
		// Iniciar la Timeline
		timelineEstacio.play();
	}

	void inicialitzarPaneHistorial() {

		graficTemperatura();
		calculsTemp();
		graficPluja();
		calculsPluja();
		graficVent();
		calculsVent();

		Timeline timeLineHistorial = new Timeline();

		timeLineHistorial.setCycleCount(Animation.INDEFINITE);

		// definim un keyFram per a que canvi cada minut
		KeyFrame keyFrameHistorial = new KeyFrame(Duration.seconds(60), new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				graficVent.getData().remove(0);
				graficTemp.getData().remove(0);
				graficPluja.getData().remove(0);
				graficTemperatura();
				calculsTemp();
				graficPluja();
				calculsPluja();
				graficVent();
				calculsVent();
			}
		});
		// Agregar el KeyFrame a la Timeline
		timeLineHistorial.getKeyFrames().add(keyFrameHistorial);
		// Iniciar la Timeline
		timeLineHistorial.play();

	}

	void graficTemperatura() {
		// Configurem els eixos X i Y
		CategoryAxis eixX = new CategoryAxis();
		eixX.setLabel("Hora del dia");

		NumberAxis eixY = new NumberAxis(-10, 50, 1);
		eixY.setLabel("Graus");

		// inicialitzo per a poder posar les dades
		XYChart.Series<String, Number> dadesTemperatura = new XYChart.Series<>();
		dadesTemperatura.setName("Temperatura");

		// carrego les dades de l'objecte
		Termometre temp1 = new Termometre();
		int[] tempDia = temp1.getTemperaturaDia();

		// creo les diferents hores del dia i la pluja per cadascun.
		for (int i = 0; i < 24; i++) {
			dadesTemperatura.getData().add(new XYChart.Data<>(String.valueOf(i), tempDia[i]));
		}

		// Agreguem les dades al grafic
		graficTemp.getData().add(dadesTemperatura);
	}

	void graficPluja() {
		// Configurem els eixos X i Y
		CategoryAxis eixX = new CategoryAxis();
		eixX.setLabel("Hora del dia");

		NumberAxis eixY = new NumberAxis(0, 20, 1);
		eixY.setLabel("Litres de precipitació");

		// inicialitzo per a poder posar les dades
		XYChart.Series<String, Number> dadesPluja = new XYChart.Series<>();
		dadesPluja.setName("Precipitació");

		// carrego les dades de l'objecte
		Pluviometre pluja1 = new Pluviometre();
		int[] tempDia = pluja1.getPlujaDia();

		// creo les diferents hores del dia i la pluja per cadascun.
		for (int i = 0; i < 24; i++) {
			dadesPluja.getData().add(new XYChart.Data<>(String.valueOf(i), tempDia[i]));
		}

		// Agregar les dades al gràfic
		graficPluja.getData().add(dadesPluja);
	}

	void graficVent() {

		NumberAxis eixX = new NumberAxis(0, 120, 1);
		eixX.setLabel("Velocitat del Vent");

		CategoryAxis eixY = new CategoryAxis();
		eixY.setLabel("Hora del dia");

		// inicialitzo per a poder posar les dades
		XYChart.Series<Number, String> dadesVent = new XYChart.Series<>();
		dadesVent.setName("Velocitat del vent");

		// carrego les dades de l'objecte
		Anemometre vent1 = new Anemometre();
		int[] ventDia = vent1.getVentDia();

		// creo les diferents hores del dia i la pluja per cadascun.
		for (int i = 0; i < 24; i++) {
			dadesVent.getData().add(new XYChart.Data<>(ventDia[i], String.valueOf(i)));
		}

		// Agregar les dades al gràfic
		graficVent.getData().add(dadesVent);
	}

	void calculsTemp() {
		// carrego les dades de l'objecte
		Termometre temp1 = new Termometre();
		int[] tempDies = temp1.getTemperaturaDia();

		// calculo la maxima
		int tempMax = 0;
		for (int i = 0; i < tempDies.length; i++) {
			if (i == 0) {
				tempMax = tempDies[0];
			} else {
				if (tempMax < tempDies[i]) {
					tempMax = tempDies[i];
				}
			}
		}
		etiNumMaxTemp.setText("" + tempMax + " ºC");

		// calculo la minima
		int tempMin = 0;
		for (int i = 0; i < tempDies.length; i++) {
			if (i == 0) {
				tempMin = tempDies[0];
			} else {
				if (tempMin > tempDies[i]) {
					tempMin = tempDies[i];
				}
			}
		}
		etiNumMinTemp.setText("" + tempMin + " ºC");

		// calculo la mitjana
		double tempMitjana = 0;
		int tempTotal = 0;
		for (int i = 0; i < tempDies.length; i++) {
			tempTotal = tempTotal + tempDies[i];
		}
		tempMitjana = tempTotal / 24;
		etiNumMitjanaTemp.setText("" + tempMitjana + " ºC");

	}

	void calculsPluja() {
		// carrego les dades de l'objecte
		Pluviometre pluja1 = new Pluviometre();
		int[] plujaDia = pluja1.getPlujaDia();

		// calculo la suma de tots els litres
		int plujaTotal = 0;
		for (int i = 0; i < plujaDia.length; i++) {
			plujaTotal = plujaTotal + plujaDia[i];
		}
		etiNumPluja.setText("" + plujaTotal);

	}

	void calculsVent() {
		// carrego les dades de l'objecte
		Anemometre vent1 = new Anemometre();
		int[] forcaVentDia = vent1.getVentDia();
		String[] direccioVentDia = vent1.getDireccioVentDia();

		// calculo la maxima
		int ventMax = 0;
		for (int i = 0; i < forcaVentDia.length; i++) {
			if (i == 0) {
				ventMax = forcaVentDia[0];
			} else {
				if (ventMax < forcaVentDia[i]) {
					ventMax = forcaVentDia[i];
				}
			}
		}
		etiNumMaxVent.setText("" + ventMax + " km/h");

		// calculo la minima
		int ventMin = 0;
		for (int i = 0; i < forcaVentDia.length; i++) {
			if (i == 0) {
				ventMin = forcaVentDia[0];
			} else {
				if (ventMin > forcaVentDia[i]) {
					ventMin = forcaVentDia[i];
				}
			}
		}
		etiNumMinVent.setText("" + ventMin + " km/h");

		// miro quina es la direcció predominant

		int[] comptadorDireccio = new int[8];

		for (int i = 0; i < direccioVentDia.length; i++) {
			if (direccioVentDia[i].equals("N")) {
				comptadorDireccio[0]++;
			} else if (direccioVentDia[i].equals("NE")) {
				comptadorDireccio[1]++;
			} else if (direccioVentDia[i].equals("E")) {
				comptadorDireccio[2]++;
			} else if (direccioVentDia[i].equals("SE")) {
				comptadorDireccio[3]++;
			} else if (direccioVentDia[i].equals("S")) {
				comptadorDireccio[4]++;
			} else if (direccioVentDia[i].equals("SO")) {
				comptadorDireccio[5]++;
			} else if (direccioVentDia[i].equals("O")) {
				comptadorDireccio[6]++;
			} else if (direccioVentDia[i].equals("NO")) {
				comptadorDireccio[7]++;
			}
		}

		int comptadorVent = 0;
		for (int i = 0; i < comptadorDireccio.length; i++) {
			if (comptadorVent < comptadorDireccio[i]) {
				comptadorVent = i;
			}
		}

		String[] direccionsVent = { "Nord", "NordEst", "Est", "SudEst", "Sud", "SudOest", "Oest", "NordOest" };
		etiNumDireccioVent.setText("" + direccionsVent[comptadorVent]);
	}

	void inicialitzarPaneRellotge() {

		Timeline timelineRellotge = new Timeline();
		// inicialitzar per a que es repeteixi indefinidament
		timelineRellotge.setCycleCount(Animation.INDEFINITE);

		// definim un keyFram per a que canvi cada segon
		KeyFrame keyFrameRellotge = new KeyFrame(Duration.seconds(1), new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {

				// fem que cada segon l'etiqueta s'actualitzi amb la hora actual
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
				etiHoraRellotge.setText("" + LocalTime.now().format(dtf));
			}
		});

		// Agregar el KeyFrame a la Timeline
		timelineRellotge.getKeyFrames().add(keyFrameRellotge);
		// Iniciar la Timeline
		timelineRellotge.play();
	}

	private LocalDateTime horaAlarma;

	void inicialitzarPaneAlarma() {

		etiMissatgeAlarma.setVisible(false);
		Timeline timeLineAlarma = new Timeline();

		textHoraAlarma.setText("00");
		textMinutAlarma.setText("00");
		textSegonAlarma.setText("00");
		;

		// agafem el text de a quina hora volem que s'afageixi l'alarma a traves del set
		// on action del boto
		botoAlarma.setOnAction((ActionEvent) -> {
			etiMissatgeAlarma.setVisible(false);
			int hora = Integer.parseInt(textHoraAlarma.getText());
			int minut = Integer.parseInt(textMinutAlarma.getText());
			int segon = Integer.parseInt(textSegonAlarma.getText());

			horaAlarma = LocalDateTime.of(LocalDate.now(), LocalTime.of(hora, minut, segon));

			String horaSt;
			String minutSt;
			String segonSt;
			if (hora < 10) {
				horaSt = "0" + hora;
			} else
				horaSt = "" + hora;
			if (minut < 10) {
				minutSt = "0" + minut;
			} else
				minutSt = "" + minut;
			if (segon < 10) {
				segonSt = "0" + segon;
			} else
				segonSt = "" + segon;

			etiAlarma.setText(horaSt + ":" + minutSt + ":" + segonSt);

			// hem de calcular la duracio fins a l'hora especifica

			java.time.Duration duracioAlarma = java.time.Duration.between(LocalDateTime.now(), horaAlarma);
			Duration duracioFinsAlarma = Duration.seconds(duracioAlarma.toSeconds());

			// definim un keyFrame fins a l'hora especifica

			KeyFrame keyFrameAlarma = new KeyFrame(duracioFinsAlarma, new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					// aixo es el que passar a l'hora especifica
					etiMissatgeAlarma.setVisible(true);
				}
			});

			textHoraAlarma.setText("00");
			textMinutAlarma.setText("00");
			textSegonAlarma.setText("00");

			// Agregar el KeyFrame a la Timeline
			timeLineAlarma.getKeyFrames().add(keyFrameAlarma);
			timeLineAlarma.play();

		});

	}

	private LocalDateTime horaTimer;
	Timeline timeLineTimerCadaSegon = new Timeline();

	void inicialitzarPaneTimer() {
		etiMissatgeTimer.setVisible(false);
		textHoraTimer.setText("00");
		textMinutTimer.setText("00");
		textSegonTimer.setText("00");

		botoTimer.setOnAction((ActionEvent) -> {
			etiMissatgeTimer.setVisible(false);
			int hora = Integer.parseInt(textHoraTimer.getText());
			int minut = Integer.parseInt(textMinutTimer.getText());
			int segon = Integer.parseInt(textSegonTimer.getText()) + 1;

			horaTimer = LocalDateTime.now().plusHours(hora).plusMinutes(minut).plusSeconds(segon);

			timeLineTimerCadaSegon = new Timeline(new KeyFrame(Duration.seconds(1), new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					java.time.Duration duracioTimer = java.time.Duration.between(LocalDateTime.now(), horaTimer);
					if (duracioTimer.isNegative() || duracioTimer.getSeconds() == 0) {
						etiMissatgeTimer.setVisible(true);
						etiTimer.setText("00:00:00");
						timeLineTimerCadaSegon.stop();
					} else {
						Platform.runLater(() -> {
							long horas = duracioTimer.toHours();
							long minutos = duracioTimer.toMinutesPart();
							long segundos = duracioTimer.toSecondsPart();
							etiTimer.setText(String.format("%02d:%02d:%02d", horas, minutos, segundos));
						});
					}
				}
			}));

			textHoraTimer.setText("00");
			textMinutTimer.setText("00");
			textSegonTimer.setText("00");

			timeLineTimerCadaSegon.setCycleCount(Timeline.INDEFINITE);
			timeLineTimerCadaSegon.play();
		});
	}

	private int segons = 0;
	Timeline timeLineCrono = new Timeline();
	Timeline timeLineCrono2 = new Timeline();
	// private int segons2=0;
	int comptadorBanderes = 0;
	int numeroVoltes = 0;
	int segonsTotals = 0;

	void inicialitzarPaneCrono() {

		creacioTaulaEtiquetes();

		etiVolta.setVisible(false);
		etiCrono2.setVisible(false);
		botoPlayCrono.setOnAction((ActionEvent) -> {
			botoPlayCrono.setDisable(true);
			botoStopCrono.setDisable(false);
			botoReiniciarCrono.setDisable(false);
			segons = 0;
			timeLineCrono = new Timeline(new KeyFrame(Duration.seconds(1), new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					segons++;
					actualitzarTemps();

				}
			}));
			timeLineCrono.setCycleCount(Timeline.INDEFINITE);
			timeLineCrono.play();
		});
		botoStopCrono.setOnAction((ActionEvent) -> {
			botoStopCrono.setDisable(true);
			botoPlayCrono.setDisable(false);
			timeLineCrono.stop();

		});
		botoReiniciarCrono.setOnAction((ActionEvent) -> {
			etiCrono1.setText("00:00:00");
			numeroVoltes = 0;
			for (int i = 0; i < taulaEtiquetes.length; i++) {
				taulaEtiquetes[i].setText("");
			}

		});

		botoBanderaCrono.setOnAction((ActionEvent) -> {

			// agafo els numeros del crono per tal de poder calcular la volta
			String[] cronoSplit = etiCrono1.getText().split(":");
			int hora = Integer.parseInt(cronoSplit[0]);
			int minuts = Integer.parseInt(cronoSplit[1]);
			int segons = Integer.parseInt(cronoSplit[2]);

			int hora2 = hora - segonsTotals / 3600;
			int minuts2 = minuts - segonsTotals % 3600 / 60;
			int segons2 = segons - segonsTotals % 60;
			String horaSt = "";
			String minutsSt = "";
			String segonsSt = "";
			if (hora2 < 10) {
				horaSt = "0" + hora2;
			} else
				horaSt = "" + hora2;
			if (minuts2 < 10) {
				minutsSt = "0" + minuts2;
			} else
				minutsSt = "" + minuts2;
			if (segons2 < 10) {
				segonsSt = "0" + segons2;
			} else
				segonsSt = "" + segons2;

			taulaEtiquetes[numeroVoltes].setText(horaSt + ":" + minutsSt + ":" + segonsSt);

			// vaig sumant tots els segons de les etiquetes per tal de restar-ho despres del
			// total del crono
			segonsTotals = segonsTotals + (hora - segonsTotals / 3600) + (minuts - segonsTotals % 3600 / 60)
					+ (segons - segonsTotals % 60);
			System.out.println(segonsTotals);
			numeroVoltes++;
		});

	}

	private void actualitzarTemps() {
		int hores = segons / 3600;
		int minuts = (segons % 3600) / 60;
		int segonsRestants = segons % 60;

		String formatTemps = String.format("%02d:%02d:%02d", hores, minuts, segonsRestants);
		etiCrono1.setText(formatTemps);
	}

	Label[] taulaEtiquetes = new Label[20];

	private void creacioTaulaEtiquetes() {

		for (int i = 0; i < taulaEtiquetes.length; i++) {
			taulaEtiquetes[i] = new Label();
			taulaEtiquetes[i].setLayoutX(etiVolta.getLayoutX());
			taulaEtiquetes[i].setLayoutY(etiVolta.getLayoutY() + i * 20);
			taulaEtiquetes[i].setFont(etiVolta.getFont());
			Pane61.getChildren().add(taulaEtiquetes[i]);
		}
		etiVolta.setVisible(false);
	}

	int comptadorMusica = 0;
	Pane[] panesMusica = new Pane[13];
	Label[] etiMusica = new Label[13];
	Button[] botonsMusica = new Button[13];
	Media musica;
	MediaPlayer mediaPlayer;

	void inicialitzarPaneMusica() {
		botoPlayMusica.setDisable(true);

		// creo una taula de panes i etiquetes
		panesMusica[0] = PaneMusica1;
		panesMusica[1] = PaneMusica2;
		panesMusica[2] = PaneMusica3;
		panesMusica[3] = PaneMusica4;
		panesMusica[4] = PaneMusica5;
		panesMusica[5] = PaneMusica6;
		panesMusica[6] = PaneMusica7;
		panesMusica[7] = PaneMusica8;
		panesMusica[8] = PaneMusica9;
		panesMusica[9] = PaneMusica10;
		panesMusica[10] = PaneMusica11;
		panesMusica[11] = PaneMusica12;
		panesMusica[12] = PaneMusica13;

		etiMusica[0] = etiMusica1;
		etiMusica[1] = etiMusica2;
		etiMusica[2] = etiMusica3;
		etiMusica[3] = etiMusica4;
		etiMusica[4] = etiMusica5;
		etiMusica[5] = etiMusica6;
		etiMusica[6] = etiMusica7;
		etiMusica[7] = etiMusica8;
		etiMusica[8] = etiMusica9;
		etiMusica[9] = etiMusica10;
		etiMusica[10] = etiMusica11;
		etiMusica[11] = etiMusica12;
		etiMusica[12] = etiMusica13;

		botonsMusica[0] = botoMusica1;
		botonsMusica[1] = botoMusica2;
		botonsMusica[2] = botoMusica3;
		botonsMusica[3] = botoMusica4;
		botonsMusica[4] = botoMusica5;
		botonsMusica[5] = botoMusica6;
		botonsMusica[6] = botoMusica7;
		botonsMusica[7] = botoMusica8;
		botonsMusica[8] = botoMusica9;
		botonsMusica[9] = botoMusica10;
		botonsMusica[10] = botoMusica11;
		botonsMusica[11] = botoMusica12;
		botonsMusica[12] = botoMusica13;

		for (int i = 0; i < panesMusica.length; i++) {
			panesMusica[i].setVisible(false);
		}

		// deshabilito el boto d'importar per si hi ha més de 13 cançons o el recuadre
		// no te text
		botoImportarMusica.setDisable(true);

		if (comptadorMusica < 13) {

			textNomMusica.setOnMouseExited((MouseEvent a) -> {
				String text = textNomMusica.getText();
				if (text.length() > 0) {
					botoImportarMusica.setDisable(false);
				} else
					botoImportarMusica.setDisable(true);
			});
		} else
			botoImportarMusica.setDisable(true);

		botoImportarMusica.setOnAction((ActionEvent A) -> {

			String nomMusica = textNomMusica.getText();
			stage = (Stage) ((Node) A.getSource()).getScene().getWindow();
			FileChooser seleccionarFitxer = new FileChooser();
			seleccionarFitxer.setInitialDirectory(new File("musica"));
			String rutaAbsolutaFitxer = seleccionarFitxer.showOpenDialog(stage).getPath();

			String novaRutaAbsolutaFitxer = Paths.get("").toAbsolutePath().toString() + "/musica/" + nomMusica + ".mp3";
			copiarIRenombrarFitxer(rutaAbsolutaFitxer, novaRutaAbsolutaFitxer);

			panesMusica[comptadorMusica].setVisible(true);
			etiMusica[comptadorMusica].setText(nomMusica + ".mp3");
			textNomMusica.setText("");
			comptadorMusica++;

		});

		// Ruta al archivo de música
		for (int i = 0; i < panesMusica.length; i++) {
			final int k = i;
			botonsMusica[k].setOnAction((ActionEvent A) -> {

				etiNomMusica.setText(etiMusica[k].getText());
				String basePath = Paths.get("").toAbsolutePath().toString();
				String filePath = basePath + "/musica/" + etiMusica[k].getText();
				Media musica = new Media(new File(filePath).toURI().toString());
				mediaPlayer = new MediaPlayer(musica);
				botoPlayMusica.setDisable(false);
			});
		}

		// Reproducir la música
		botoPlayMusica.setOnAction((ActionEvent A) -> {
			mediaPlayer.play();

			for (int i = 0; i < panesMusica.length; i++) {
				final int k = i;
				botonsMusica[k].setDisable(true);
			}
		});

		botoStopMusica.setOnAction((ActionEvent A) -> {
			for (int i = 0; i < panesMusica.length; i++) {
				final int k = i;
				botonsMusica[k].setDisable(false);
			}
			mediaPlayer.stop();
		});

	}

	private Stage stage;

	// FUNCIO PER A IMPORTAR
	public void copiarIRenombrarFitxer(String rutaAbsolutaFitxer, String novaRutaAbsolutaFitxer) {

		File origen = new File(rutaAbsolutaFitxer);
		File desti = new File(novaRutaAbsolutaFitxer);

		try {

			InputStream in = new FileInputStream(origen);
			OutputStream out = new FileOutputStream(desti);

			byte[] buf = new byte[1024];
			int len;

			while ((len = in.read(buf)) > 0) {
				out.write(buf, 0, len);
			}

			in.close();
			out.close();
		} catch (Exception e2) {
			System.out.println("Error en la funcio");
		}
	}

}
