public class SmartSecurityCamera extends SmartDevice{
		private boolean isRecording;
		private boolean motionDetection;
		private String videoQuality;
		
		public SmartSecurityCamera(String deviceId, String deviceName, String location, boolean isPoweredOn, double powerConsumption, boolean isRecording, boolean motionDetection, String videoQuality){
			super(deviceId,deviceName,location, isPoweredOn, powerConsumption);
			this.isRecording = isRecording;
			this.motionDetection = motionDetection;
			setVideoQuality(videoQuality);
		}
		
		public void setVideoQuality(String videoQuality){
			if (videoQuality != null && !videoQuality.isEmpty()){
				this.videoQuality = videoQuality;
			}
		}
		
		public String getVideoQuality(){
			return videoQuality;
		}
		
		public void startRecording(){
			isRecording = true;
			System.out.println("Запись началась");
		}
		
		public void startRecording(boolean motionDetection){
			isRecording = true;
			this.motionDetection = motionDetection;
			if (motionDetection){
				System.out.println("Запись включена с обнаружением движения");
			} else {
				System.out.println("Запись включена без обнаружения движения");
			}
		}
		public void detectMotion(){
			motionDetection = true;
			System.out.println("Включено обнаружение движения");
		}
		
		public void getLiveFeed(){
			System.out.println("Запись получена в разрешении " + getVideoQuality());
		}
		
		
		@Override
		public void getDeviceType(){
			System.out.println("Умная камера");
		}
		
		@Override
		public void performAction(){
			isRecording = false;
			motionDetection = false;
			System.out.println("Запись остановлена");
		}
}
